package pojos;

public class UserPOJO {
	//POJO props map to DB table cols
	private String userEmail,userPass;
	private double subAmount;
	public UserPOJO() {
		// TODO Auto-generated constructor stub
	}
	public UserPOJO(String userEmail, String userPass, double subAmount) {
		super();
		this.userEmail = userEmail;
		this.userPass = userPass;
		this.subAmount = subAmount;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public double getSubAmount() {
		return subAmount;
	}
	public void setSubAmount(double subAmount) {
		this.subAmount = subAmount;
	}
	@Override
	public String toString() {
		return "UserPOJO [userEmail=" + userEmail + ", userPass=" + userPass
				+ ", subAmount=" + subAmount + "]";
	}
	

}
