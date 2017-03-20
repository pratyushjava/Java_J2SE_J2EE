package AdminActions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.AdminDao;
import Pojos.HotelPojos;

import com.opensymphony.xwork2.ActionSupport;

public class HotelDetails extends ActionSupport implements SessionAware{
	
	AdminDao dao;
	Map<String, Object> map;
	
	public HotelDetails() {
		// TODO Auto-generated constructor stub
		dao=new AdminDao();
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		map=arg0;
		
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<HotelPojos> al;
		al=(ArrayList<HotelPojos>)dao.getAllHotels();
		map.put("hd", al);
		if(al!=null)
			return SUCCESS;
		return ERROR;
		
		//return super.execute();
	}

}
