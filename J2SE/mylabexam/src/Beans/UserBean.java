package Beans;

import DAO.UserDao;
import POJO.UserPojo;

public class UserBean {
	
	private String email;
	private String password;
	private UserDao dao;
	private UserPojo u1;
	
	public UserBean() {
		System.out.println("in bean def constr");
		dao=new UserDao();
	}
	
	public UserBean(String email, String password) {
		super();
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
	
	public String getValid()
	{
		String res="user_fail";
		System.out.println(email);
		System.out.println(password);
		u1=dao.validate(email, password);
		System.out.println(u1);
		if(u1!=null)
			res="user_ok";
		return res;
		
		
	}
	
	public void cleanup()
	{
		dao.Cleanup();
	}
	
	

}
