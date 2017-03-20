package Actions;

import java.io.Serializable;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.hib_dao;
import Pojos.PassangerPojos;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserPayment  extends ActionSupport implements ModelDriven<PassangerPojos>,SessionAware{
	
	hib_dao dao;
	int i;
	PassangerPojos p=new PassangerPojos();
	Map<String, Object> map;
	double total;
	
	public UserPayment() {
		System.out.println("in def constr............");
		dao=new hib_dao();
	}
	
	

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		map=arg0;
		
	}



	@Override
	public PassangerPojos getModel() {
		// TODO Auto-generated method stub
		return p;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in execute of payment"+p);
		map.put("users1", p);
		
	/*int i=dao.AddUserPassangerInfo(p);
	System.out.println(i);
	*/if(p!=null)
		return SUCCESS;
	return ERROR;
		
		
	}
	
	
	

}
