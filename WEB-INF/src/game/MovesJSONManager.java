package game;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class MovesJSONManager extends Action{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		PrintWriter out = response.getWriter();
		GameMovesStore newGameMovesStore=new GameMovesStore();
		String gameIdString=request.getParameter("gameId");
		int gameId=Integer.parseInt(gameIdString);
		LastMoveStore newLastMoveStore=newGameMovesStore.getGameMoveMap(gameId);
		
		ArrayList lastWhiteMove= newLastMoveStore.getLastMoveMap("white");
		ArrayList lastBlackMove= newLastMoveStore.getLastMoveMap("black");
		
		StringBuffer onlineUsersJsonString=new StringBuffer();
		if(lastWhiteMove !=null)
		{
		onlineUsersJsonString.append(" {\"white\": [{");
		onlineUsersJsonString.append("\"pieceId\":\""+lastWhiteMove.get(0)+"\",");
		onlineUsersJsonString.append("\"startSquare\":\""+lastWhiteMove.get(1)+"\",");
		onlineUsersJsonString.append("\"endSquare\":\""+lastWhiteMove.get(2)+"\",");
		onlineUsersJsonString.append("\"inCheck\":\""+lastWhiteMove.get(3)+"\",");	
		onlineUsersJsonString.append("\"gameOver\":\""+lastWhiteMove.get(4)+"\",");
		onlineUsersJsonString.append("\"quitGame\":\""+lastWhiteMove.get(5)+"\"}],");
		}
		else
		{
			onlineUsersJsonString.append(" {\"white\": [{");
			onlineUsersJsonString.append("\"pieceId\":\"null\",");
			onlineUsersJsonString.append("\"startSquare\":\"null\",");
			onlineUsersJsonString.append("\"endSquare\":\"null\",");
			onlineUsersJsonString.append("\"inCheck\":\"null\",");
			onlineUsersJsonString.append("\"gameOver\":\"null\",");
			onlineUsersJsonString.append("\"quitGame\":\"null\"}],");
		}
		
		if(lastBlackMove !=null)
		{
		onlineUsersJsonString.append(" \"black\": [{");
		onlineUsersJsonString.append("\"pieceId\":\""+lastBlackMove.get(0)+"\",");
		onlineUsersJsonString.append("\"startSquare\":\""+lastBlackMove.get(1)+"\",");
		onlineUsersJsonString.append("\"endSquare\":\""+lastBlackMove.get(2)+"\",");
		onlineUsersJsonString.append("\"inCheck\":\""+lastBlackMove.get(3)+"\",");
		onlineUsersJsonString.append("\"gameOver\":\""+lastBlackMove.get(4)+"\",");
		onlineUsersJsonString.append("\"quitGame\":\""+lastBlackMove.get(5)+"\"}]}");
		}
		else
		{
			onlineUsersJsonString.append(" \"black\": [{");
			onlineUsersJsonString.append("\"pieceId\":\"null\",");
			onlineUsersJsonString.append("\"startSquare\":\"null\",");
			onlineUsersJsonString.append("\"endSquare\":\"null\",");
			onlineUsersJsonString.append("\"inCheck\":\"null\",");
			onlineUsersJsonString.append("\"gameOver\":\"null\",");
			onlineUsersJsonString.append("\"quitGame\":\"null\"}]}");
		}
		
		
		out.println(onlineUsersJsonString);
		out.flush();
		
		
		return mapping.findForward(null);
		
	}
}
