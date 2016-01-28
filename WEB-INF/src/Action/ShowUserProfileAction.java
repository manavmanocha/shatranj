package Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.GamesDao;
import dao.UsersDao;

public class ShowUserProfileAction extends Action
{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	 {
		
		String userName= request.getParameter("userName");
		UsersDao newUsersDao = new UsersDao();
		List userDetailsList = newUsersDao.getUserDetails(userName);
		request.setAttribute("userDetailsList", userDetailsList);
		
		GamesDao newGamesDao = new GamesDao();
		List userGamesList = newGamesDao.getUserGames(userName);
		request.setAttribute("userGamesList", userGamesList);
		
		return mapping.findForward("success");
		
	 }

}
