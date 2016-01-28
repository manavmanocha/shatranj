package users;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.*;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import users.invitation.InvitationBean;

public class InviteAction extends Action
{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		
		
		String userInvitedBy =(String)request.getSession(true).getAttribute("userName");
		String userInvited=request.getParameter("userInvited");
		
		UsersDao newUsersDao = new UsersDao() ;		
		boolean  isUserBusy = newUsersDao.checkUserBusy(userInvited);
		if(isUserBusy == true)
		{
			InvitationBean newInvitation=new InvitationBean();			
			newInvitation.setInvitationStatus(userInvitedBy,"4");
		}
		else if (isUserBusy == false)
		{
		InvitationBean newInvitation=new InvitationBean();
		newInvitation.insertInvitation(userInvited,userInvitedBy);
		newInvitation.setInvitationStatus(userInvitedBy,"1");		
	
		}
		return mapping.findForward(null);
	}
	

}
