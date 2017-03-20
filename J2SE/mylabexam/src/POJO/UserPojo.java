package POJO;

public class UserPojo {
	
	private String email;
	private String password;
	public UserPojo(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	
	public UserPojo() {
	System.out.println("in pojo def constrs");
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
	@Override
	public String toString() {
		return "UserPojo [email=" + email + ", password=" + password + "]";
	};
	
	

}
