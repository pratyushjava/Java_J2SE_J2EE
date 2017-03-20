package AdminActions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.AdminDao;
import Pojos.HotelPojos;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.regexp.internal.recompile;

public class HotelInsert extends ActionSupport implements ModelDriven<HotelPojos>,SessionAware{
	
	
	AdminDao dao;
	HotelPojos hp=new HotelPojos();
	Map<String, Object> map;
	
	public HotelInsert() {
		System.out.println("in hotel Insert def Constr.....");
		dao=new AdminDao();
	}
	

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		map=arg0;
		
	}


	@Override
	public HotelPojos getModel() {
		// TODO Auto-generated method stub
		return hp;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in execute before save "+hp);
		ArrayList<HotelPojos> al;
	int i=	dao.AddHotels(hp);
al=	dao.getAllHotels();
map.put("hd", al);
	if(i!=0)
	{
		return SUCCESS;
	}
	return ERROR;
		
	}
	
	
	
	

}
