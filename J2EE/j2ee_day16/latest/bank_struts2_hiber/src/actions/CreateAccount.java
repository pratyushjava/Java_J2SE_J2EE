package actions;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import pojos.BankAccount;
import pojos.BankUser;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.BankDAO;

public class CreateAccount extends ActionSupport implements ModelDriven<BankAccount>,SessionAware {
	private BankUser user;//will be retrieved from session
	private BankAccount account=new BankAccount();//supplying empty model to MD
	private BankDAO dao=new BankDAO();
	private Map<String,Object> sessionMap;

	@Override
	public BankAccount getModel() {
		System.out.println("in get model create");
		return account;
	}
	
	

	@Override
	public void setSession(Map<String, Object> arg0) {
		sessionMap=arg0;
		
	}



	public BankUser getUser() {
		return user;
	}

	
	public String createAccount() throws Exception {
		user=(BankUser) sessionMap.get("bank_user");//retrieved bank user from session
	//	System.out.println("from sess user ="+user);
	//	System.out.println("a/c = "+account);
		List<BankAccount> l1=dao.createAccount(user.getUserId(),account);
		user.setAccts(l1);
//		System.out.println("a/c list "+l1);
//		System.out.println("from user "+user.getAccts());
		
		return SUCCESS;
		
	}
	
	
	
	

}
