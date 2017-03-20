package Actions;

import java.util.Map;

import javax.servlet.http.HttpSession;

import oracle.net.ns.SessionAtts;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import DAOS.hib_dao;
import Pojos.TicketPojos;

import com.opensymphony.xwork2.ActionSupport;

public class PrintTicketInfo extends ActionSupport implements SessionAware{
	
	hib_dao dao;
	TicketPojos tk=new  TicketPojos();
	int PNR;
	Map<String, Object> map;
	public int getPNR() {
		return PNR;
	}
	public void setPNR(int pNR) {
		PNR = pNR;
	}
	public PrintTicketInfo() {
		System.out.println("in def constr of print ticket........");
		dao=new hib_dao();
		
		
	
	}
	
	
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.map=arg0;
		
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in execute............");
		tk=dao.getTicketInfo(PNR);
		System.out.println("in execute of print ticket info"+tk);
		
		if(tk!=null)
		{
			map.put("ticket", tk);
			return SUCCESS;
		}
		return ERROR;
		
		
		
	}
	
	
	
	
	

}
