package users;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateAccountAction extends Action{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception{
		FileOutputStream outputStream = null;
		CreateAccountForm myForm=(CreateAccountForm)form;
		FormFile userImage = null;
		Session session = null;
		String path=null;
		 Calendar cal = new GregorianCalendar();
		 Date todayDate=cal.getTime();		
		
			String name = myForm.getName();
			String gender = myForm.getGender();
			int age = Integer.parseInt(myForm.getAge());
			int countryId = Integer.parseInt(myForm.getCountryId());
			String emailId = myForm.getEmailId();
			String userName = myForm.getUserName();
			String userPassword = myForm.getUserPassword();	
			userImage = myForm.getImage();
			String fileName=userImage.getFileName();
			int fileSize=userImage.getFileSize();
			
			if(fileSize !=0)
			{
				path = getServlet().getServletContext().getRealPath("")+"\\"+"img\\upload\\UserImages\\"+userName+"_"+fileName;
				
			outputStream = new FileOutputStream(new File(path));
			outputStream.write(userImage.getFileData());
			outputStream.close();
			}
			
			
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session =sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			hibernate.Users newUser =new hibernate.Users();
			newUser.setName(name);
			newUser.setGender(gender);
			newUser.setAge(age);
			newUser.setCountryId(countryId);
			newUser.setUserEmail(emailId);
			newUser.setUserName(userName);
			newUser.setUserPassword(userPassword);
			newUser.setRegistrationDate(todayDate);
			newUser.setUserRole("player");
			newUser.setUserStatus("active");
			String imagePath ="img\\upload\\UserImages\\"+userName+"_"+fileName;
			newUser.setUserImage(imagePath);
			
			 session.save(newUser);
			 tr.commit();
			   session.flush();
			      session.close();
		
		
	
			
			
			
			
		
			
				
		
      
       
          
            return mapping.findForward("success");
        
        
	}
	

}
