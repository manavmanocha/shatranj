package Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.GamesDao;
import dao.MovesDao;

public class ViewOnlineGameAction extends Action
{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	 {
		
		int gameId = Integer.parseInt(request.getParameter("gameId"));
		MovesDao newMovesDao = new MovesDao();
		List gameMovesList = newMovesDao.getGameMovesList(gameId);
		JSONArray gameMovesJSONArray = null;
		gameMovesJSONArray = JSONArray.fromObject(gameMovesList);

		
	
		request.setAttribute("gameMovesJSONArray", gameMovesJSONArray);
		
		GamesDao newGamesDao = new GamesDao();
		List gameUsers = newGamesDao.getGameusers(gameId);
		request.setAttribute("gameUsers", gameUsers);
		request.setAttribute("gameId", gameId);
		
		
		return(mapping.findForward("success"));
		
	 }

}

