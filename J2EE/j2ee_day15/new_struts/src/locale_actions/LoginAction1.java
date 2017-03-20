package locale_actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction1 extends ActionSupport{

	private String username;
	private String password;
	 
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	//business logic
	public String execute() {

		return SUCCESS;

	}

	//simple validation
	public void validate(){
	
		if("".equals(getUsername())){
			addFieldError("username", "User Name is required");
		}
		if("".equals(getPassword())){
			addFieldError("password", "Password is required");
		}
		
	}
}