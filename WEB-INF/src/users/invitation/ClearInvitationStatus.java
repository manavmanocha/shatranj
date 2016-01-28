package users.invitation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ClearInvitationStatus extends Action
{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		HttpSession httpSession = request.getSession(true);	
		String LoggedInUserName=(String)httpSession.getAttribute("userName");
		InvitationBean newInvitationBean=new InvitationBean();
		
		
		
		 newInvitationBean.clearInvitationStatus(LoggedInUserName);
		 return mapping.findForward(null);
	}
}