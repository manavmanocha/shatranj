

package users;

import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





public class LoginAction extends Action
{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		String userName = ((LoginForm)form).getUserName();
	    String userPassword = ((LoginForm)form).getUserPassword();
	    PrintWriter out=response.getWriter();
	    Session session = null;
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		session =sessionFactory.openSession();
		String SQL_QUERY ="Select userToLogin.userPassword,userToLogin.name,userToLogin.gender,userToLogin.age,userToLogin.userImage from Users userToLogin  where userToLogin.userName='"+userName+"'";
		Query query = session.createQuery(SQL_QUERY);
		
		for(Iterator it=query.iterate();it.hasNext();)
		{
			Object[] userDetails = (Object[]) it.next();
			String storedPassword=(String)userDetails[0];
			if(storedPassword.equals(userPassword))
			{
				String storedName=(String)userDetails[1];
				String storedGender=(String)userDetails[2];
				String storedAge=String.valueOf(userDetails[3]);
				String userImage=((String)userDetails[4]).replace('\\', '/');
				
				request.getSession(true).setAttribute("userName", userName);
				request.getSession(true).setAttribute("storedName", storedName);
				request.getSession(true).setAttribute("storedGender", storedGender);
				request.getSession(true).setAttribute("storedAge", storedAge);
				request.getSession(true).setAttribute("userImage", userImage);
				 Transaction updatetransaction = session.beginTransaction();
				 hibernate.Users newUser =new hibernate.Users();
				 
				 String hql = "update Users userToLogin set userToLogin.userOnline=true where userToLogin.userName ='"+userName+"'";
				 Query updateQuery = session.createQuery(hql);
				 int rowCount = updateQuery.executeUpdate();			 
				 
				
				 updatetransaction.commit();
				 session.flush();
				 session.close();
				 return mapping.findForward("success");
				
			}
			else
			{   
				ActionMessages errors=new ActionMessages();
				errors.add("passwordError",new ActionMessage("error.wrong.password"));
				saveErrors(request, errors);
				return mapping.findForward("failure");
			}
				        
		 }
		ActionMessages errors=new ActionMessages();
		errors.add("userError",new ActionMessage("error.wrong.username"));
		saveErrors(request, errors);
		return mapping.findForward("failure");
       
		
		

        
     
    
  }

	
}

