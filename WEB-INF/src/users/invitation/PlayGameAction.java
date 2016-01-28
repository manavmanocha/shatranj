package users.invitation;

import game.GameMovesStore;
import hibernate.GamesHistory;
import dao.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class PlayGameAction extends Action
{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		
		
		
		
		Date todayDate=new Date();
		
		

		Session session = null;
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		session =sessionFactory.openSession();
		
		
		HttpSession httpSession = request.getSession(true);
		String LoggedInUserName=(String)httpSession.getAttribute("userName");
		
		if(request.getParameter("invitedBy") != null)
		{
			String invitedBy=request.getParameter("invitedBy");
			
			Transaction tr1 = session.beginTransaction();
			hibernate.GamesHistory newGame =new hibernate.GamesHistory();		
			newGame.setUser1(LoggedInUserName);
			newGame.setUser2(invitedBy);
			newGame.setGameStatus("ongoing");
			newGame.setStartDate(todayDate);
			session.save(newGame);
			
			tr1.commit();
			
			String SQL_QUERY ="from GamesHistory game where game.user1='"+LoggedInUserName+"' AND user2='"+invitedBy+"' order by game.startDate DESC" ;
			
			Query query = session.createQuery(SQL_QUERY);
			query.setMaxResults(1);
			int gameId=0;
			for(Iterator it=query.iterate();it.hasNext();)
			{
				GamesHistory gameObject = (GamesHistory) it.next();
				gameId=gameObject.getGameId();
			}
			
			GameMovesStore newGameMovesStore=new GameMovesStore();
			newGameMovesStore.setNewGameMoveMap(gameId);
			
			request.setAttribute("invitedBy",invitedBy);
			request.setAttribute("gameId",gameId);
			
			session.flush();
			
			UsersDao newUsersDao= new UsersDao();			
			newUsersDao.setUserBusy(LoggedInUserName);
			newUsersDao.setUserBusy(invitedBy);
				
		}
		
		
		
		
		if(request.getParameter("invited") != null)
		{
		String invited=request.getParameter("invited");
			
		String SQL_QUERY ="from GamesHistory game where game.user1='"+invited+"' AND user2='"+LoggedInUserName+"' order by game.startDate DESC" ;
		
		Query query = session.createQuery(SQL_QUERY);
		query.setMaxResults(1);
		int gameId=0;
		for(Iterator it=query.iterate();it.hasNext();)
		{
			GamesHistory gameObject = (GamesHistory) it.next();
			gameId=gameObject.getGameId();
		}
		
		
		request.setAttribute("gameId",gameId);
		request.setAttribute("invited",invited);
		}
		
		session.close();
		
		InvitationBean newInvitationBean=new InvitationBean();
		newInvitationBean.deleteUserInvitationMap(LoggedInUserName);	
		return mapping.findForward("success");
	}
}



