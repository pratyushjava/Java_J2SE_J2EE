package Actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.hib_dao;
import Pojos.PassangerPojos;
import Pojos.TicketPojos;

import com.opensymphony.xwork2.ActionSupport;

public class PaymentComplete extends ActionSupport implements SessionAware{
	
	
	hib_dao dao;
	Map<String, Object> map;
	PassangerPojos pas;
	TicketPojos tp;
	
	public PaymentComplete() {
		System.out.println("in payment complete def constr.....");
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
		
		System.out.println("in payment complete execute.......");
pas=		(PassangerPojos)map.get("users");

System.out.println("in execute "+pas);
int i=dao.AddUserPassangerInfo(pas);
System.out.println(i);
tp=dao.getTicketInfo(i);
System.out.println("the ticket details"+tp);
System.out.println("the no of row affected"+i);
if(i!=0 && tp!=null)
{
	map.put("ticket", tp);
	return SUCCESS;
}
	
return ERROR;
		
	}
	
	
	
	

}
