package register;

import java.util.Date;



import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private String email,password;
	private Date dob;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("in exec");
		return SUCCESS;
	}
	/*@Override
	public void validate() {
		System.out.println("in validate1");
		if (email == null || email.length() ==0)
			//addFieldError("email", "email can't be blank");
			addFieldError("email",getText("email.required"));
	}*/
	
	

}
