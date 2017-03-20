package Actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.AdminDao;
import DAOS.hib_dao;
import Pojos.CityPojos;
import Pojos.FlightPojos;

import com.opensymphony.xwork2.ActionSupport;

public class AdminListFill extends ActionSupport implements SessionAware{
	
	
	
//	hib_dao dao;
	AdminDao dao1;
	ArrayList<CityPojos> alCity;
	ArrayList<FlightPojos> alFlight;
	Map<String, Object> map;
	public AdminListFill() {
		System.out.println("def admin fill list constr....");
	//	dao=new hib_dao();
		dao1=new AdminDao();
	}
	
	

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		map=arg0;
		
	}



	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("get the city list");
	alCity=(ArrayList<CityPojos>)	dao1.getAllCity();
	System.out.println("al citis are"+alCity);
alFlight=(ArrayList<FlightPojos>)	dao1.showflights();
System.out.println("the flight details "+alFlight);
		if(alCity.toString()!=null     && alFlight.toString()!=null)
		{
			System.out.println("in if");
			map.put("CityList", alCity);
			map.put("sd", alFlight);
		return SUCCESS;
		}
		return ERROR;
	}
	
	

}
