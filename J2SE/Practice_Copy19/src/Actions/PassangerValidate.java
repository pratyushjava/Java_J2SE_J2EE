package Actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.hib_dao;
import Pojos.PassangerPojos;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PassangerValidate extends ActionSupport implements ModelDriven<PassangerPojos>,SessionAware{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	hib_dao dao;
	PassangerPojos p=new PassangerPojos();
	PassangerPojos p11;
	Map<String, Object> map;
	
	
	
	
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.map=arg0;
		
	}



	public PassangerValidate() {
		System.out.println("in passanger validate def constr.......");
		dao=new hib_dao();
	}

	
	
	@Override
	public PassangerPojos getModel() {
		// TODO Auto-generated method stub
		return p;
	}



	@Override
	public String execute() throws Exception {
		System.out.println("in passanger validate execute.....");
		System.out.println(p);
	p11=	dao.ValidatePassanger(p);
	map.put("passanger", p11);
	if(p11!=null)
		return SUCCESS;
	return ERROR;
		
		
	}



	@Override
	public void validate() {
		// TODO Auto-generated method stub
		System.out.println("in validate method");
		if(p.getEmailid().equals("") && p.getPassword().equals(""))
		{
			try
			{
			System.out.println("in validate if");
			addFieldError("emailid", "email id can not be empty");
			addFieldError("password", "password field can not be empty");
		}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		//super.validate();
	}
	
	
	
	
	

}
