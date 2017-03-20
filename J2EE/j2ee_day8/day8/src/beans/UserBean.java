package beans;

import java.util.HashMap;

import pojos.UserPOJO;

public class UserBean {
	// props --- MUST MATCH with rq. param names
	// mandatory only while using property=*
	private String email, pass;
	private double subAmt;
	private HashMap<String, UserPOJO> users;

	// when jsp using JBs via WC --- MUST supply def constr.
	public UserBean() {
		System.out.println("in userBean constr");
		users = new HashMap<>();
		UserPOJO[] u1 = { new UserPOJO("a@gmail", "123", 100),
				new UserPOJO("c@gmail", "111", 300),
				new UserPOJO("b@gmail", "1234", 500) };
		for (UserPOJO u : u1)
			users.put(u.getUserEmail(), u);

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSubAmt() {
		return subAmt;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	//B.L
	public boolean validateUser()
	{
		boolean sts=false;
		if(users.containsKey(email))
		if (users.get(email).getUserPass().equals(pass)) {
			sts=true;
			subAmt=users.get(email).getSubAmount();
		}
		return sts;
	}

}
