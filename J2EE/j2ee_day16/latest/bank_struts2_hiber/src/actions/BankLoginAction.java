package actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import pojos.BankUser;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.BankDAO;

public class BankLoginAction extends ActionSupport implements ModelDriven<BankUser>,SessionAware {
	private BankUser user=new BankUser();
	private BankDAO dao=new BankDAO();
	private Map<String,Object> sessionMap;

	@Override
	public BankUser getModel() {
		System.out.println("in get model");
		return user;
	}
	
	

	@Override
	public void setSession(Map<String, Object> arg0) {
		sessionMap=arg0;
		
	}



	public BankUser getUser() {
		return user;
	}

	
	public String validateUser() throws Exception {
		user=dao.validateUser(user.getName(),user.getPassword());
		if (user != null) {
			sessionMap.put("bank_user",user);
		return SUCCESS;
		}
		return ERROR;
	}
	
	
	
	

}
