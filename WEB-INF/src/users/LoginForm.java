package users;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;


public class LoginForm extends ValidatorForm {
	  private String userName=null;
	  private String userPassword=null;	 

	  public void setUserName(String name){
	    this.userName=name;
	  }
 
	  public String getUserName(){
	    return this.userName ;
	  }

	  public void setUserPassword(String password){
	    this.userPassword=password;
	  }

	  public String getUserPassword(){
	    return this.userPassword;
	  }
	  
	 
	}

