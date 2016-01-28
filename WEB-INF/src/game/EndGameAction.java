package game;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.GamesDao;
import dao.UsersDao;

public class EndGameAction extends Action{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		int gameId=Integer.parseInt(request.getParameter("gameId"));
		HttpSession httpSession = request.getSession(true);
		String gameWinner=(String)httpSession.getAttribute("userName");
		
		
		GamesDao newGamesDao = new GamesDao();			
		List resetUsersList = newGamesDao.getGameusers(gameId);
		String user1=(String)resetUsersList.get(0);
		String user2=(String)resetUsersList.get(1);	
		
		newGamesDao.endGame(gameWinner, gameId);
		
		UsersDao newUsersDao = new UsersDao();
		newUsersDao.resetUserBusy(user1);
		newUsersDao.resetUserBusy(user2);
		newUsersDao.setWinner(gameWinner);
		 if(gameWinner.equals(user1))
		 {
			 newUsersDao.setLooser(user2);
		 }
		 else if(gameWinner.equals(user2))
		 {
			 newUsersDao.setLooser(user1);
		 }
		
		
		return mapping.findForward("success");
	}

}
