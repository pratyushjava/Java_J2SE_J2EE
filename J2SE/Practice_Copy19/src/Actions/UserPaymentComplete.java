package Actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.hib_dao;
import Pojos.PassangerPojos;

import com.opensymphony.xwork2.ActionSupport;

public class UserPaymentComplete extends ActionSupport implements SessionAware{
	
	hib_dao dao;
	Map<String, Object> map;
	PassangerPojos pas;
	
	
	public UserPaymentComplete() {
		// TODO Auto-generated constructor stub
		System.out.println("in user payment def constr.......");
		dao=new hib_dao();
	}
	
	
	


	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		map=arg0;
		
	}





	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in user payment complte execute method");
	pas=	(PassangerPojos)map.get("users1");
	System.out.println("in user payment complte "+pas);
	int d=dao.AddUserPassangerInfo(pas);
	System.out.println("the no of rows affected"+d);
	if(d!=0)
		return SUCCESS;
	return ERROR;
		
	}
	
	

}
