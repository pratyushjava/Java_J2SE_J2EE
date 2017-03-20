package Actions;

import java.util.*;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.mapping.Map;

import DAOS.hib_dao;
import Pojos.FlightPojos;

import com.opensymphony.xwork2.ActionSupport;

public class FullFlightDetails extends ActionSupport implements SessionAware {
	
	
	hib_dao dao;
	ArrayList<FlightPojos> al=new ArrayList<>();
	java.util.Map<String, Object> map;
	private int to,from;
	private Date departdate;
	private int Adult,Children,Infants;
	
	
	
	
	
	
	
	
	
    
	























	









public FullFlightDetails() {
		System.out.println("in action dao");
		dao=new hib_dao();
	}


	
	
	

	



		@Override
	public void setSession(java.util.Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		System.out.println("in set session");
		this.map=arg0;
		
	}








	@Override
	public String execute() throws Exception {
		System.out.println("in exeute method");
		System.out.println(to);
		al=dao.getFullFlights();
		System.out.println(map);
		System.out.println("in exrcute "+al);
		if(al!=null)
		{
		try
		{
			map.put("flight", al);
		}catch (Exception e) {
			e.printStackTrace();
		}
			return SUCCESS;
		}
		return ERROR;
		
	}
	
	
	
	

}
