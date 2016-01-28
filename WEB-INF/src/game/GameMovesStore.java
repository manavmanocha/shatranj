package game;

import java.util.ArrayList;
import java.util.HashMap;


public class GameMovesStore {
private static HashMap<Integer,LastMoveStore> gameMoveMap=new HashMap<Integer,LastMoveStore>() ;
	
	public void setNewGameMoveMap(int gameId)
	{
		
		
		gameMoveMap.put(gameId, new LastMoveStore());
		
	}
	
	public  LastMoveStore getGameMoveMap(int gameId)
	{
		return(gameMoveMap.get(gameId));
		
		
	}

}
