package dao;

import hibernate.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UsersDao {
	
	Session session=null;	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	public  void setUserBusy(String userName)
	{	
	 	session =sessionFactory.openSession();
	 	Transaction updatetransaction = session.beginTransaction();			 
		String hql = "update Users userToLogin set userToLogin.userBusy=true where userToLogin.userName ='"+userName+"'";
		Query updateQuery = session.createQuery(hql);
		int rowCount = updateQuery.executeUpdate();	
		updatetransaction.commit();
		session.flush();
		session.close();		
	}
	
	
	public void resetUserBusy(String userName)
	{		
		session =sessionFactory.openSession();
	 	Transaction updatetransaction = session.beginTransaction();			 
		String hql = "update Users userToLogin set userToLogin.userBusy=false where userToLogin.userName ='"+userName+"'";
		Query updateQuery = session.createQuery(hql);
		int rowCount = updateQuery.executeUpdate();	
		updatetransaction.commit();
		session.flush();
		session.close();		
	}
	
	public boolean checkUserBusy(String userName)
	{	
		session =sessionFactory.openSession();			 
		Users newUsers = (Users) session.get(Users.class, userName);
		boolean userBusy = newUsers.isUserBusy();
		session.flush();
		session.close();
		return userBusy;	
	}
	
	public void setWinner(String userName)
	{
		session =sessionFactory.openSession();
		Transaction updateTransaction = session.beginTransaction();
		Users newUser = (Users) session.get(Users.class, userName);
		int totalGames = newUser.getTotalGames();
		newUser.setTotalGames(totalGames+1);
		int totalWins = newUser.getTotalWins();
		newUser.setTotalWins(totalWins+1);
		int totalPoints = newUser.getTotalPoints();
		newUser.setTotalPoints(totalPoints+5);
		session.save(newUser);
		updateTransaction.commit();
		session.flush();
		session.close();	
	}
	
	public void setLooser(String userName)
	{
		session =sessionFactory.openSession();	
		Transaction updateTransaction = session.beginTransaction();		
		Users newUser = (Users) session.get(Users.class, userName);
		int totalGames = newUser.getTotalGames();
		newUser.setTotalGames(totalGames+1);		
		int totalPoints = newUser.getTotalPoints();
		newUser.setTotalPoints(totalPoints-1);		
		session.save(newUser);
		updateTransaction.commit();
		session.flush();
		session.close();		
	}
	
	public void quitUser(String userName)
	{
		session =sessionFactory.openSession();	
		Transaction updateTransaction = session.beginTransaction();		
		Users newUser = (Users) session.get(Users.class, userName);
		int totalGames = newUser.getTotalGames();
		newUser.setTotalGames(totalGames+1);		
		int totalDraws = newUser.getTotalDraws();
		newUser.setTotalDraws(totalDraws+1);		
		session.save(newUser);
		updateTransaction.commit();
		session.flush();
		session.close();		
	}
	
	public HashMap<Integer,List> getTopUsers()
	{
		session =sessionFactory.openSession();	
		HashMap<Integer,List> topUsersMap=new HashMap<Integer, List>();	
		int i = 1;
		
		String SQL_QUERY ="Select user.userName,user.name,user.totalPoints,user.userImage from Users user order by user.totalPoints DESC";
		Query query = session.createQuery(SQL_QUERY);
		query.setMaxResults(10);
		
		for(Iterator it=query.iterate();it.hasNext();)
		{
			   Object[] userDetails = (Object[]) it.next();	
			   List topUserDetails = new ArrayList();
			   topUserDetails.add(userDetails[0]);			   
			   topUserDetails.add(userDetails[1]);
			   topUserDetails.add(userDetails[2]);
			   topUserDetails.add(((String)userDetails[3]).replace('\\', '/'));
			   topUsersMap.put(i,topUserDetails);
			   i++;
		}
		return topUsersMap;
		
	}
	
	public List getUserDetails(String userName)
	{
		session =sessionFactory.openSession();	
		List userDetailsList = new ArrayList();
		Users newUser = (Users) session.get(Users.class, userName);
		
		userDetailsList.add(newUser.getUserImage().replace('\\', '/'));
		userDetailsList.add(newUser.getName());
		userDetailsList.add(newUser.getAge());	
		userDetailsList.add(newUser.getGender());
		userDetailsList.add(getCountry(newUser.getCountryId()));			
		userDetailsList.add(newUser.getTotalPoints());
		userDetailsList.add(newUser.getUserEmail());
		
		return(userDetailsList);
	}
	
	public String getCountry(int countryId)
	{
		session =sessionFactory.openSession();	
		Countries newCountry = (Countries) session.get(Countries.class, countryId);
		return(newCountry.getCountryName());
		
	}
}

