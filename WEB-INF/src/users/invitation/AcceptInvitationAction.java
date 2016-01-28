package users.invitation;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class AcceptInvitationAction extends Action
{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		 HttpSession httpSession = request.getSession(true);
		String invitedBy=request.getParameter("invitedBy");
		InvitationBean newInvitationBean=new InvitationBean();
		newInvitationBean.setInvitationStatus(invitedBy,"2");
		
		 String LoggedInUserName=(String)httpSession.getAttribute("userName");
		 newInvitationBean.insertInvitation(LoggedInUserName,null);
		 return mapping.findForward("success");
	}
		
}
