package validate_actions;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class LoginValidate extends ActionSupport {
	private String email;
	private String passwd;
	private Date regDate;//date format is corr. to def locale --- En 
	//mm/dd/yyyy
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("in exec");
		return SUCCESS;
		
	}
	@Override
	public void validate() {
		System.out.println("in validate");
	/*	//email cant'be blank,password not -blank 
		if (email == null || email.length() == 0)
	//		addFieldError("email","email can't be blank");
			addFieldError("email", getText("email.required"));
		if (passwd == null || passwd.length() == 0)
		//	addFieldError("passwd","password can't be blank");
			addFieldError("passwd",getText("password.required"));*/
		if (regDate == null)
			addFieldError("regDate",getText("date.required"));
	}
	
	
	

}
