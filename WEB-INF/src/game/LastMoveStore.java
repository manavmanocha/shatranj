package game;

import java.util.ArrayList;
import java.util.HashMap;

public class LastMoveStore {
	private  HashMap<String,ArrayList> lastMoveMap= new HashMap<String, ArrayList>();
	
	public void setLastMoveMap(String userColor,ArrayList movePositions)
	{
		lastMoveMap.put(userColor,movePositions);		
	}
	
	public  ArrayList getLastMoveMap(String userColor)
	{
		return(lastMoveMap.get(userColor));
		
		
	}

}
