package pojos;

import java.util.ArrayList;

public class BankUserPOJO {
	private int userId;
	private String name,password;
	private ArrayList<AccountPOJO> accounts;
	public BankUserPOJO() {
		// TODO Auto-generated constructor stub
	}
	public BankUserPOJO(int userId, String name, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<AccountPOJO> getAccounts() {
		return accounts;
	}
	public void setAccounts(ArrayList<AccountPOJO> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "BankUser Dtls  [userId=" + userId + ", name=" + name
				+ ", password=" + password + "]";
	}
	
	
}
