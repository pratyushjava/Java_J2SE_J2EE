package pojos;

import java.io.Serializable;

public class AccountPOJO implements Serializable{
	private int acctID,userID;
	private String type;
	private double balance;
	public AccountPOJO() {
		// TODO Auto-generated constructor stub
	}
	public AccountPOJO(int acctID, int userID, String type, double balance) {
		super();
		this.acctID = acctID;
		this.userID = userID;
		this.type = type;
		this.balance = balance;
	}
	public int getAcctID() {
		return acctID;
	}
	public void setAcctID(int acctID) {
		this.acctID = acctID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account Details  [acctID=" + acctID + ", type=" + type
				+ ", balance=" + balance + "]";
	}
	

}
