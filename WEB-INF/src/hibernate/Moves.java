package hibernate;

import java.sql.Timestamp;


public class Moves {
	private int moveId;
	private int gameId;
	private String pieceId;
	private String startPosition;
	private String endPosition;
	private Timestamp moveTime;
	
	
	public int getMoveId() {
		return moveId;
	}
	public void setMoveId(int moveId) {
		this.moveId = moveId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getPieceId() {
		return pieceId;
	}
	public void setPieceId(String pieceId) {
		this.pieceId = pieceId;
	}
	public String getStartPosition() {
		return startPosition;
	}
	public void setStartPosition(String startPosition) {
		this.startPosition = startPosition;
	}
	public String getEndPosition() {
		return endPosition;
	}
	public void setEndPosition(String endPosition) {
		this.endPosition = endPosition;
	}
	public Timestamp getMoveTime() {
		return moveTime;
	}
	public void setMoveTime(Timestamp moveTime) {
		this.moveTime = moveTime;
	}
	
	
	
}
