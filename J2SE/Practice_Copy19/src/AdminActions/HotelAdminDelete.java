package AdminActions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.AdminDao;
import Pojos.FlightPojos;
import Pojos.HotelPojos;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class HotelAdminDelete extends ActionSupport implements SessionAware
{
	//FlightPojos flight_temp=new FlightPojos();
	HotelPojos hp=new HotelPojos();
	AdminDao dao;
	ArrayList<HotelPojos> al=new ArrayList<>();
	Map<String, Object> map;
	int rbtn;
	
	public HotelAdminDelete() {
		System.out.println("in admin delete default constructor..,.");
		dao=new AdminDao();
	}
	
	
	
	public int getRbtn() {
		return rbtn;
	}



	public void setRbtn(int rbtn) {
		this.rbtn = rbtn;
	}



	@Override
	public void setSession(Map<String, Object> arg0) {
		this.map=arg0;
	}
	
	@Override
	public String execute() throws Exception {
		//String result=dao.delete();
		//if(result=="sucess")
		System.out.println("in delete execute");
		String res=null;
	//al=	((ArrayList<HotelPojos>)map.get("hd"));
	//System.out.println("in delete execute "+al);
	System.out.println("the value of radio buton"+rbtn);
	/*for (FlightPojos f : alFlight) {
		if(f.getFlightid()==rbtn)
		{
			res=dao.delete(rbtn);
			break;
		}
	}
	*/
	res=dao.Hoteldelete(rbtn);
	
	
	if(res=="sucess")
			return SUCCESS;
		return ERROR;
	}
}
