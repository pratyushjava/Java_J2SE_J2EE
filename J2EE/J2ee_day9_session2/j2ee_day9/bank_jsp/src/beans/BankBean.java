package beans;

import java.util.ArrayList;

import pojos.AccountPOJO;
import pojos.BankUserPOJO;
import dao.BankDAO;

public class BankBean {
	private String uName, uPass;
	private BankDAO dao;
	private BankUserPOJO bankUser;
	private String status;
	private ArrayList<AccountPOJO> acctList;

	// constr
	public BankBean() throws Exception {
		System.out.println("in bank bean constr");
		dao = new BankDAO();
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	/*
	 * public String getuPass() { return uPass; }
	 */
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}

	public BankUserPOJO getBankUser() {
		return bankUser;
	}

	// B.L -- written in form of getter -- user validation
	// re-named as pseudo-getter --- so that JSP can
	// invoke B.L w/o writing scriptlets.
	public String getStatus() throws Exception {
		bankUser = dao.getUserByNamePass(uName, uPass);
		System.out.println("after validate " + bankUser);
		if (bankUser != null)
			return "transactions";
		return "bank_user_err";
	}

	public void logout() throws Exception {
		if (dao != null) {
			dao.cleanUp();
			dao = null;
		}
	}

	// B.L -- written in form of getter -- getting a/c summary for all a/cs
	public ArrayList<AccountPOJO> getAcctList() throws Exception {
		return dao.getUserAccounts(bankUser);
	}

}
