package Action;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.GamesDao;
import dao.UsersDao;

public class HomePageAction extends Action
{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	 {
		UsersDao newUsersDao = new UsersDao();
		HashMap<Integer,List> topUsersMap = newUsersDao.getTopUsers();
		request.setAttribute("topUsers", topUsersMap);
		
		GamesDao newGamesDao = new GamesDao();
		List ongoingGamesList = newGamesDao.getOngoingGames();
		request.setAttribute("ongoingGamesList", ongoingGamesList);
		
		return mapping.findForward("success");
		
	 }

}
