package Actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.AdminDao;
import Pojos.FlightPojos;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminDelete extends ActionSupport implements SessionAware
{
	FlightPojos flight_temp=new FlightPojos();
	AdminDao dao;
	ArrayList<FlightPojos> alFlight=new ArrayList<>();
	Map<String, Object> map;
	int rbtn;
	
	public AdminDelete() {
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
	alFlight=	((ArrayList<FlightPojos>)map.get("sd"));
	System.out.println("in delete execute "+alFlight);
	System.out.println("the value of radio buton"+rbtn);
	/*for (FlightPojos f : alFlight) {
		if(f.getFlightid()==rbtn)
		{
			res=dao.delete(rbtn);
			break;
		}
	}
	*/
	res=dao.delete(rbtn);
	
	
	if(res=="sucess")
			return SUCCESS;
		return ERROR;
	}
}
