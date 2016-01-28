package users;

import hibernate.Users;

import java.io.PrintWriter;
import java.util.Iterator;

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
import org.hibernate.cfg.Configuration;
import users.invitation.InvitationBean;


public class DataFromServer extends Action{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
	
	
		  HttpSession httpSession = request.getSession(true);
		  String LoggedInUserName=(String)httpSession.getAttribute("userName");
		 	PrintWriter out = response.getWriter();
			Session hibernateSession = null;
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			hibernateSession =sessionFactory.openSession();
			
			StringBuffer onlineUsersJsonString=new StringBuffer();
			onlineUsersJsonString.append(" {\"users\": [");
					
			String SQL_QUERY ="from Users onlineUser where onlineUser.userOnline=true";
			Query query = hibernateSession.createQuery(SQL_QUERY);
			
			for(Iterator it=query.iterate();it.hasNext();)
			{	
				
				
				Users onlineUserFromDatabase=(Users)it.next();
				String userNameFromDatabase=onlineUserFromDatabase.getUserName();
				if( !(userNameFromDatabase .equals(LoggedInUserName)) )
				{
					onlineUsersJsonString.append("{\"username\":\""+userNameFromDatabase+"\",");
					onlineUsersJsonString.append("\"name\":\""+onlineUserFromDatabase.getName()+"\",");
					onlineUsersJsonString.append("\"gender\":\""+onlineUserFromDatabase.getGender()+"\",");
					onlineUsersJsonString.append("\"age\":\""+String.valueOf(onlineUserFromDatabase.getAge())+"\",");
					onlineUsersJsonString.append("\"userbusy\":\""+onlineUserFromDatabase.isUserBusy()+"\",");
					onlineUsersJsonString.append("\"countryId\":\""+String.valueOf(onlineUserFromDatabase.getCountryId())+"\",");
					onlineUsersJsonString.append("\"totalPoints\":\""+String.valueOf(onlineUserFromDatabase.getTotalPoints())+"\",");
					onlineUsersJsonString.append("\"image\":\""+onlineUserFromDatabase.getUserImage().replace('\\', '/')+"\"},");
				}
				
				
			}
			
			int sizeOfOnlineUsersJsonString=onlineUsersJsonString.length();
			onlineUsersJsonString.deleteCharAt(sizeOfOnlineUsersJsonString-1);
			onlineUsersJsonString.append("]");
			
			
			InvitationBean newInvitationBean=new InvitationBean();
			String invitedBy =newInvitationBean.getinvitedBy(LoggedInUserName);
			
			onlineUsersJsonString.append(",\"invitedby\":\""+invitedBy+"\"");
			String invitationStatus =newInvitationBean.getInvitationStatus(LoggedInUserName);
			onlineUsersJsonString.append(",\"invitationstatus\":\""+invitationStatus+"\"");
			
			onlineUsersJsonString.append("}");
			
			out.println(onlineUsersJsonString);
			out.flush();
			return mapping.findForward(null);
	}
			
		
		
	
		
	}

