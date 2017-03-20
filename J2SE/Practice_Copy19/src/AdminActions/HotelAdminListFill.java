package AdminActions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.AdminDao;
import DAOS.hib_dao;
import Pojos.CityPojos;
import Pojos.FlightPojos;
import Pojos.HotelPojos;

import com.opensymphony.xwork2.ActionSupport;

public class HotelAdminListFill extends ActionSupport implements SessionAware{
	
	
	
//	hib_dao dao;
	AdminDao dao1;
	ArrayList<CityPojos> alCity;
	ArrayList<HotelPojos> al;
	Map<String, Object> map;
	public HotelAdminListFill() {
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
al=(ArrayList<HotelPojos>)	dao1.getAllHotels();
System.out.println("the flight details "+al);
		if(alCity.toString()!=null     && al.toString()!=null)
		{
			System.out.println("in if");
			map.put("CityList", alCity);
			map.put("hd", al);
		return SUCCESS;
		}
		return ERROR;
	}
	
	

}
