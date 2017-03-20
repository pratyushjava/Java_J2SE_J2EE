package Actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.hib_dao;
import Pojos.CityPojos;

import com.opensymphony.xwork2.ActionSupport;

public class FillList extends ActionSupport implements SessionAware{
	
	
	
	hib_dao dao;
	ArrayList<CityPojos> alCity;
	Map<String, Object> mapCity;
	
	public FillList() {
		dao=new hib_dao();
		System.out.println("in Fill list action def constr.........");
	}
	
	

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.mapCity=arg0;
		
	}



	@Override
	public String execute() throws Exception {
		System.out.println("in fill List execute");
		alCity=dao.getAllCity();
		mapCity.put("CityList", alCity);
		System.out.println("in execute after fetching"+alCity);
		if(alCity!=null)
			return SUCCESS;
		return ERROR;
		
	}
	
	
	
	
	

}
