package Actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.AdminDao;
import DAOS.hib_dao;
import Pojos.FlightPojos;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminInsert extends ActionSupport implements ModelDriven<FlightPojos> ,SessionAware
{
	public AdminInsert() {
		System.out.println("in admin insert def constr");
		dao=new AdminDao();
	}
	
FlightPojos flight_temp=new FlightPojos();
AdminDao dao;
ArrayList<FlightPojos> alFlight=new ArrayList<>();
Map<String, Object> map;


	@Override
public FlightPojos getModel() {
System.out.println("in get model......");
	return flight_temp;
}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.map=arg0;		
	}

	@Override
	public String execute() throws Exception 
	{		
		System.out.println("in execut emethod");
		System.out.println(flight_temp);
		alFlight=dao.insert(flight_temp);
		System.out.println("after insert in execute");
		System.out.println(alFlight);
		map.put("fd", alFlight);
			if(alFlight!=null)
			return SUCCESS;
		return ERROR;
	}
}