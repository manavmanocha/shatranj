package users;



import hibernate.Users;

import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class UserDetails extends Action{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
	
			PrintWriter out = response.getWriter();
			
			String userName=request.getParameter("username");
		 	
			Session session = null;
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session =sessionFactory.openSession();
			
			StringBuffer userDetailsJsonString=new StringBuffer();
			
					
			String SQL_QUERY ="from Users onlineUser where onlineUser.userName='"+userName+"'";
			Query query = session.createQuery(SQL_QUERY);
			
			for(Iterator it=query.iterate();it.hasNext();)		
			{	
				
				
				Users userDetailsFromDatabase=(Users)it.next();	
				userDetailsJsonString.append("{\"name\":\""+userDetailsFromDatabase.getName()+"\",");
				userDetailsJsonString.append("\"gender\":\""+userDetailsFromDatabase.getGender()+"\",");
				userDetailsJsonString.append("\"age\":\""+String.valueOf(userDetailsFromDatabase.getAge())+"\",");				
				userDetailsJsonString.append("\"totalPoints\":\""+String.valueOf(userDetailsFromDatabase.getTotalPoints())+"\",");
				userDetailsJsonString.append("\"image\":\""+userDetailsFromDatabase.getUserImage().replace('\\', '/')+"\"}");	
				
				
			}
			
			
			
			out.println(userDetailsJsonString);
			out.flush();
			return mapping.findForward(null);
	}
			
		
		
	
		
	}

