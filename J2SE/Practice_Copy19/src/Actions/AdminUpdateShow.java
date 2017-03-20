package Actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.AdminDao;
import Pojos.FlightPojos;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminUpdateShow extends ActionSupport implements ModelDriven<FlightPojos>,SessionAware
{
	FlightPojos flight_temp=new FlightPojos();
	AdminDao dao;
	ArrayList<FlightPojos> alFlight=new ArrayList<>();
	Map<String, Object> map;
	
	public AdminUpdateShow() {
	System.out.println("in ADminUpdateShow constructor");
	dao=new AdminDao();
	}
	
	@Override
	public FlightPojos getModel() {
		System.out.println("in getmodel constructor");
		return flight_temp;
	}
	
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.map=arg0;		
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("in execut emethod");
		System.out.println(flight_temp);
		try
		{
		alFlight=dao.showflights();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after showing in execute");
		System.out.println(alFlight);
		map.put("sd", alFlight);
		if(alFlight!=null)
		return SUCCESS;
	return ERROR;
	}
}