package hibernate;

import java.util.Date;


public class GamesHistory {
	private int gameId;
	private String user1;
	private String user2;
	private String gameStatus;
	private Date startDate;
	private Date endDate;
	private String winner;
	
	public void setGameId(int gameId){
		    this.gameId=gameId;
		  }

	public int getGameId(){
		    return this.gameId ;
		  }
	
	public void setUser1(String user1){
	    this.user1=user1;
	  }

	public String getUser1(){
	    return this.user1 ;
	  }
	public void setUser2(String user2){
	    this.user2=user2;
	  }

	public String getUser2(){
	    return this.user2 ;
	  }
 
	public void setGameStatus(String gameStatus){
	    this.gameStatus=gameStatus;
	  }

	public String getGameStatus(){
	    return this.gameStatus ;
	  }
	public void setStartDate(Date startDate){
	    this.startDate=startDate;
	  }

	public Date getStartDate(){
	    return this.startDate ;
	  }
	public void setEndDate(Date endDate){
	    this.endDate=endDate;
	  }

	public Date getEndDate(){
	    return this.endDate ;
	  }
	public void setWinner(String winner){
	    this.winner=winner;
	  }

	public String getWinner(){
	    return this.winner ;
	  }
}
