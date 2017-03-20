package AdminActions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.AdminDao;
import Pojos.FlightPojos;
import Pojos.HotelPojos;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class HotelAdminUpdate  extends ActionSupport implements ModelDriven<HotelPojos>,SessionAware
{
	//FlightPojos hp=new FlightPojos();
	HotelPojos hp=new HotelPojos();
	AdminDao dao;
	//ArrayList<FlightPojos> al=new ArrayList<>();
	ArrayList<HotelPojos> al=new ArrayList<>();
	Map<String, Object> map;

	
	public HotelAdminUpdate() {
	System.out.println("in admin update default constructor.");
	dao=new AdminDao();
	}
	
	@Override
	public HotelPojos getModel() {
		System.out.println("in get model of admin update......");
		return hp;
	}
	
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.map=arg0;		
	}
		
	@Override
	public String execute() throws Exception {
		System.out.println("in execut emethod of admin update");
		System.out.println("before update "+hp);
		String result=dao.Hotelupdate(hp);
		if(result=="sucess")
			return SUCCESS;
		return ERROR;
	}
}