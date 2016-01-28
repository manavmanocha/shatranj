

package users;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import users.invitation.*;


public class LogoutAction extends Action
{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		String userName=(String)request.getSession().getAttribute("userName");
		InvitationBean newInvitationBean=new InvitationBean();
		newInvitationBean.deleteUserInvitationMap(userName);
		HttpSession httpSession = request.getSession(false);
		if(httpSession != null) {
			httpSession.invalidate();
			} 
		 Session hibernateSession = null;
		 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		 hibernateSession =sessionFactory.openSession();
		Transaction updatetransaction = hibernateSession.beginTransaction();
		 hibernate.Users newUser =new hibernate.Users();
		 
		 String hql = "update Users userToLogin set userToLogin.userOnline=false where userToLogin.userName ='"+userName+"'";
		 Query updateQuery = hibernateSession.createQuery(hql);
		 int rowCount = updateQuery.executeUpdate();			 
		 
		
		 updatetransaction.commit();
		 hibernateSession.flush();
		 hibernateSession.close();
		return mapping.findForward("success");						    		
    }

	
}


