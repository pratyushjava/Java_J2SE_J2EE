package beans;

import dao.UserDAO;
import pojos.UserPOJO;

public class UserBean {
	private String email,password;
	private UserDAO dao=new UserDAO();
	public UserBean() {
		//mandatory only when ---jsp:useBean
		//optional in MVC -servlet controller scenario
		System.out.println("in ub def constr");
	}
	//supply paramed constr --- invocable by servlet controller
	public UserBean(String email, String password) {
		System.out.println("in ub param constr");
		this.email = email;
		this.password = password;
	}
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
	//B.L
	public UserPOJO validateUser() throws Exception
	{
		return dao.validateUser(email, password);
	}

}
