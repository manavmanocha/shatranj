package users;
import org.apache.struts.upload.FormFile;
import org.apache.struts.validator.ValidatorForm;


public class CreateAccountForm  extends ValidatorForm {
	 private String name=null;	
	 private String gender=null;
	 private String age=null;
	 private String countryId=null;
	 private String emailId=null;
	 private String userName=null;
	 private String userPassword=null;
	 private String confirmUserPassword=null;
	 private FormFile image=null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getConfirmUserPassword() {
		return confirmUserPassword;
	}
	public void setConfirmUserPassword(String confirmUserPassword) {
		this.confirmUserPassword = confirmUserPassword;
	}
	public FormFile getImage() {
		return image;
	}
	public void setImage(FormFile image) {
		this.image = image;
	}
	 
	

	  
	  
	 
	}

