package beans;

import java.util.HashMap;
import pojos.*;

public class UserBean {
	// props which reflect rq params
	private String email;
	private String pass;
	// prop -- for internal working of B.L of JB -- no setters/getters
	private HashMap<String, UserPOJO> users;
	//prop used by JSP for page rendering logic
	private UserPOJO myUser;
	//pseudo-prop --- so that JSP can invoke B.L w/o writing 
	//scriptlet
	private String status;//getter

	// def constr
	public UserBean() {
		System.out.println("in user bean constr");
		users = new HashMap<String, UserPOJO>();
		UserPOJO[] u = { new UserPOJO("a@b", "123", "abc123", 100),
				new UserPOJO("c@d", "1234", "abc1234", 200) };
		for (UserPOJO u1 : u)
			users.put(u1.getEmail(), u1);

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public UserPOJO getMyUser() {
		return myUser;
	}

	//B.L
	public String getStatus()
	{
		 if (users.containsKey(email))
			   if (users.get(email).getPassword().equals(pass))  {
				   myUser=users.get(email);
				   return "user_ok";
				  
			   }
		 return "user_err";
			
	}

}
