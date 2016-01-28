package dao;

import hibernate.GamesHistory;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GamesDao {
	
	Session session=null;	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	
	public List getGameusers(int gameId)
	{
		session =sessionFactory.openSession();	
		 
		GamesHistory newGamesHistory = (GamesHistory) session.get(GamesHistory.class, gameId);
		String user1 = newGamesHistory.getUser1();
		String user2 = newGamesHistory.getUser2();
		List gameUsersList=new ArrayList();
		gameUsersList.add(user1);
		gameUsersList.add(user2);		
		session.flush();
		session.close();
		
		return gameUsersList;
	}
	
	public void endGame(String winner,int gameId)
	{
		session =sessionFactory.openSession();
		Transaction updateTransaction = session.beginTransaction();
		Date endDate = new Date();
		GamesHistory newGamesHistory = (GamesHistory) session.get(GamesHistory.class, gameId);
		newGamesHistory.setEndDate(endDate);
		newGamesHistory.setWinner(winner);
		newGamesHistory.setGameStatus("completed");
		session.save(newGamesHistory);
		updateTransaction.commit();
		session.flush();
		session.close();
	}
	
	public void quitGame(int gameId)
	{
		session =sessionFactory.openSession();
		Transaction updateTransaction = session.beginTransaction();
		Date endDate = new Date();
		GamesHistory newGamesHistory = (GamesHistory) session.get(GamesHistory.class, gameId);
		newGamesHistory.setEndDate(endDate);		
		newGamesHistory.setGameStatus("cancelled");
		session.save(newGamesHistory);
		updateTransaction.commit();
		session.flush();
		session.close();
	}
	
	public List getUserGames(String userName)
	{
		session =sessionFactory.openSession();
		List userGamesList = new ArrayList();
		String SQL_QUERY =" from GamesHistory as newGamesHistory where newGamesHistory.user1='"+userName+"' OR newGamesHistory.user2='"+userName+"'";
		Query query = session.createQuery(SQL_QUERY);
	    for(Iterator it=query.iterate();it.hasNext();)
	    {
		    GamesHistory newGamesHistory=(GamesHistory)it.next();
		    if((newGamesHistory.getGameStatus().equals("completed")) || (newGamesHistory.getGameStatus().equals("cancelled")) )
		    {
		    	List renovatedGamesList = getRenovatedGamesList(newGamesHistory,userName);
		    	userGamesList.add(renovatedGamesList);	
		    }	
	    }
	    return(userGamesList);
	}
	
	public List getRenovatedGamesList(GamesHistory newGamesHistory,String userName)
	{
		List userGameDetails = new ArrayList();
		userGameDetails.add(0,newGamesHistory.getGameId());
		if(userName.equals(newGamesHistory.getUser1()))
		{
			userGameDetails.add(1,newGamesHistory.getUser2());
		}
		else
		{
			userGameDetails.add(1,newGamesHistory.getUser1());
		}
		userGameDetails.add(2,newGamesHistory.getStartDate());
		userGameDetails.add(3,newGamesHistory.getEndDate());
		if(newGamesHistory.getGameStatus().equals("completed"))
		{
			if(newGamesHistory.getWinner().equals(userName))
			{
				userGameDetails.add(4,"won");
			}
			else
			{
				userGameDetails.add(4,"lost");
			}
		}
		else
		{
			userGameDetails.add(4,"draw");
		}
		return(userGameDetails);
		
	}
	
	public List getOngoingGames()
	{
		session =sessionFactory.openSession();
		List ongoingGamesList = new ArrayList();
		String SQL_QUERY ="Select newGamesHistory.gameId,newGamesHistory.user1,newGamesHistory.user2 from GamesHistory as newGamesHistory where newGamesHistory.gameStatus='ongoing'";
		Query query = session.createQuery(SQL_QUERY);
	    for(Iterator it=query.iterate();it.hasNext();)
	    {
		    Object[] newOngoingObject = (Object[])it.next();	    	
		    ongoingGamesList.add(newOngoingObject);
	    }
	    return(ongoingGamesList);
	}
	
}
