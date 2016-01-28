package Action;

import java.io.PrintWriter;
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

public class GetNextMoveAction extends Action
{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	 {
		PrintWriter out = response.getWriter();
		int gameId = Integer.parseInt(request.getParameter("gameId"));
		MovesDao newMovesDao = new MovesDao();
		List gameMovesList = newMovesDao.getGameMovesList(gameId);
		JSONArray gameMovesJSONArray = null;
		gameMovesJSONArray = JSONArray.fromObject(gameMovesList);
			
		out.println(gameMovesJSONArray);
		out.flush();
		
	
		
		
		
		
		
		return(mapping.findForward(null));
		
	 }

}
