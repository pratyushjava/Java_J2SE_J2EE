package pojos;

import java.io.Serializable;

public class UserPOJO implements Serializable {
	private String email,password;
	private double subAmt;
	
	public UserPOJO() {
		// TODO Auto-generated constructor stub
	}

	public UserPOJO(String email, String password, double subAmt) {
		super();
		this.email = email;
		this.password = password;
		this.subAmt = subAmt;
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

	public double getSubAmt() {
		return subAmt;
	}

	public void setSubAmt(double subAmt) {
		this.subAmt = subAmt;
	}

	@Override
	public String toString() {
		return "UserPOJO [email=" + email + ", password=" + password
				+ ", subAmt=" + subAmt + "]";
	}
	

}
