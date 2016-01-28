package hibernate;

import java.util.Date;

public class Users {
	private String userName;
	private String userPassword;	
	private String name;	
	private String gender;
	private int age;
	private int countryId;
	private boolean userOnline;
	private String userRole;
	private Date registrationDate;
	private int totalGames;
	private int totalWins;
	private int totalDraws; 
	private int totalPoints;
	private String userImage;
	private String userStatus;
	private String userEmail;
	private boolean userBusy;
	
	

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public boolean isUserOnline() {
		return userOnline;
	}
	public void setUserOnline(boolean userOnline) {
		this.userOnline = userOnline;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public int getTotalGames() {
		return totalGames;
	}
	public void setTotalGames(int totalGames) {
		this.totalGames = totalGames;
	}
	public int getTotalWins() {
		return totalWins;
	}
	public void setTotalWins(int totalWins) {
		this.totalWins = totalWins;
	}
	public int getTotalDraws() {
		return totalDraws;
	}
	public void setTotalDraws(int totalDraws) {
		this.totalDraws = totalDraws;
	}
	public int getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public boolean isUserBusy() {
		return userBusy;
	}
	public void setUserBusy(boolean userBusy) {
		this.userBusy = userBusy;
	}

}
