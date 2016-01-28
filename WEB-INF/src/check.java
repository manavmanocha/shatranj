

import hibernate.Users;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class check {





	public static void main (String args[]) throws Exception
		{



				Session session = null;
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				session =sessionFactory.openSession();

				StringBuffer onlineUsersJsonString=new StringBuffer();
				onlineUsersJsonString.append(" {\"users\": [");




				String SQL_QUERY ="from Users onlineUser where onlineUser.userOnline=true";
				Query query = session.createQuery(SQL_QUERY);

				for(Iterator it=query.iterate();it.hasNext();)
				{


					Users onlineUserFromDatabase=(Users)it.next();
					onlineUsersJsonString.append("{\"name\":\""+onlineUserFromDatabase.getName()+"\",");
					onlineUsersJsonString.append("\"gender\":\""+onlineUserFromDatabase.getGender()+"\",");
					onlineUsersJsonString.append("\"age\":\""+String.valueOf(onlineUserFromDatabase.getAge())+"\",");
					onlineUsersJsonString.append("\"countryId\":\""+String.valueOf(onlineUserFromDatabase.getCountryId())+"\",");
					onlineUsersJsonString.append("\"totalPoints\":\""+String.valueOf(onlineUserFromDatabase.getTotalPoints())+"\",");
					onlineUsersJsonString.append("\"image\":\""+onlineUserFromDatabase.getUserImage()+"\"},");





				}
				int sizeOfOnlineUsersJsonString=onlineUsersJsonString.length();
				onlineUsersJsonString.deleteCharAt(sizeOfOnlineUsersJsonString-1);
				onlineUsersJsonString.append("]}");


				System.out.println(onlineUsersJsonString);
		}





		}




