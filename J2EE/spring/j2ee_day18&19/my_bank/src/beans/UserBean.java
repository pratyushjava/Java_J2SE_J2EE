package beans;

import java.sql.Connection;
import pojos.Account;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dao.BankDAO;

/**
 * 
 * @author Administrator
 */
public class UserBean {
	private String name, password, status;

	private ArrayList<Account> accts;
	private BankDAO bankDao;
	private int id;
	private double amt;
	private String deposit;

	public UserBean() throws Exception {
		// accts = new ArrayList<Account>();
		bankDao = BankDAO.getBankDao();
		System.out.println("in constr userbean");

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

	public ArrayList<Account> getAccts() {
		return accts;
	}

	public int getId() {
		return id;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeposit() throws Exception {
		status = "user_err";
		int index = accts.indexOf(new Account(id));
		Account a = accts.get(index);
		a.setBalance(a.getBalance() + amt);
		if (bankDao.updateAccount(a))
			status = "user_ok";
		return status;
	}

	public String getStatus() throws Exception {
		accts = bankDao.getAccountsByNmPass(name, password);
		if (accts != null)
			return "user_ok";

		return "user_err";
	}

	public BankDAO getBankDao() {
		return bankDao;
	}
	

}
