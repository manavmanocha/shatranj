package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import hibernate.GamesHistory;
import hibernate.Moves;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MovesDao {
	Session session=null;	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	public void saveMove(int gameId,String startSquare,String endSquare,String pieceId)
	{
		session =sessionFactory.openSession();	
		Transaction saveMoveTransaction = session.beginTransaction();
		Moves newMove =new Moves();
		newMove.setGameId(gameId);
		newMove.setPieceId(pieceId);
		newMove.setStartPosition(startSquare);
		newMove.setEndPosition(endSquare);	
		session.save(newMove);
		saveMoveTransaction.commit();		
	    session.close();
	
	
	}
	
	
	public List getGameMovesList(int gameId)
	{
		session =sessionFactory.openSession();
		List gameMovesList = new ArrayList();
		String SQL_QUERY =" from Moves as newMoves where newMoves.gameId='"+gameId+"'order by newMoves.moveTime";
		Query query = session.createQuery(SQL_QUERY);
	    for(Iterator it=query.iterate();it.hasNext();)
	    {
		    Moves newMoves=(Moves)it.next();
		    List newMoveDetails = new ArrayList();
		    newMoveDetails.add(newMoves.getPieceId());
		    newMoveDetails.add(newMoves.getStartPosition());
		    newMoveDetails.add(newMoves.getEndPosition());
		    
		    gameMovesList.add(newMoveDetails);
	    }
	    return(gameMovesList);
	}

}
