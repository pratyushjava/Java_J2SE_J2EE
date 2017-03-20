package pojos;

public class UserPOJO {
	private String email,password,prefs;
	private double subAmt;
	public UserPOJO() {
		// TODO Auto-generated constructor stub
	}
	public UserPOJO(String email, String password, String prefs, double subAmt) {
		super();
		this.email = email;
		this.password = password;
		this.prefs = prefs;
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
	public String getPrefs() {
		return prefs;
	}
	public void setPrefs(String prefs) {
		this.prefs = prefs;
	}
	public double getSubAmt() {
		return subAmt;
	}
	public void setSubAmt(double subAmt) {
		this.subAmt = subAmt;
	}
	@Override
	public String toString() {
		return "User Details [email=" + email + ", password=" + password
				+ ", prefs=" + prefs + ", subAmt=" + subAmt + "]";
	}
	
	

}
