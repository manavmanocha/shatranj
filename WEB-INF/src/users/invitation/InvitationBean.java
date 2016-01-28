package users.invitation;

import java.util.HashMap;

public class InvitationBean {
	private static HashMap<String,String> invitedByMap=new HashMap<String,String>();
	private static HashMap<String,String> invitationStatusMap=new HashMap<String,String>();

	public String getinvitedBy(String userName) {
		return (invitedByMap.get(userName));
	}

	public void insertNewOnlineUser(String userName) {
		invitedByMap.put(userName, null);
	}
	
	public void deleteUserInvitationMap(String userName) {
		invitedByMap.remove(userName);
		invitationStatusMap.remove(userName);
	}
	
	public void clearInvitationStatus(String userName) {		
		invitationStatusMap.remove(userName);
	}
	
	
	public void insertInvitation(String userInvited,String userInvitedBy) {
		invitedByMap.put(userInvited,userInvitedBy);
		
	}
	public void setInvitationStatus(String userName,String invitationStatus) {
		invitationStatusMap.put(userName,invitationStatus);
		
	}
	public String getInvitationStatus(String userName) {
		return(invitationStatusMap.get(userName));
		
	}
	
	

}
