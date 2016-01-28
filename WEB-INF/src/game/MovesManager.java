package game;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.GamesDao;
import dao.MovesDao;
import dao.UsersDao;

public class MovesManager extends Action
{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		String startSquare=request.getParameter("startSquare");
		String endSquare=request.getParameter("endSquare");
		String startImageId=request.getParameter("startImageId");
		String userColor=request.getParameter("userColor");
		String inCheck=request.getParameter("inCheck");
		String gameOver=request.getParameter("gameOver");
		String quitGame = null;
		if(request.getParameter("quitGame") != null)
		{
			quitGame=request.getParameter("quitGame");
		}	
		int gameId=Integer.parseInt(request.getParameter("gameId"));
		
		
		
			GameMovesStore newGameMovesStore=new GameMovesStore();
			LastMoveStore newLastMoveStore=newGameMovesStore.getGameMoveMap(gameId);
		
		ArrayList movePositions=new ArrayList();
		movePositions.add(startImageId);
		movePositions.add(startSquare);
		movePositions.add(endSquare);
		movePositions.add(inCheck);
		movePositions.add(gameOver);	
		movePositions.add(quitGame);
		newLastMoveStore.setLastMoveMap(userColor, movePositions);
		
		
		if(!(startImageId.equals("null")))
		{
			MovesDao newMovesDao = new MovesDao();
			newMovesDao.saveMove(gameId, startSquare, endSquare, startImageId);
		}
		 
		
		
		return mapping.findForward(null);
    }
}
	
