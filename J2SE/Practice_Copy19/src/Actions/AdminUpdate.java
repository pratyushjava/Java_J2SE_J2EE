package Actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.AdminDao;
import Pojos.FlightPojos;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminUpdate  extends ActionSupport implements ModelDriven<FlightPojos>,SessionAware
{
	FlightPojos flight_temp=new FlightPojos();
	AdminDao dao;
	ArrayList<FlightPojos> alFlight=new ArrayList<>();
	Map<String, Object> map;

	
	public AdminUpdate() {
	System.out.println("in admin update default constructor.");
	dao=new AdminDao();
	}
	
	@Override
	public FlightPojos getModel() {
		System.out.println("in get model of admin update......");
		return flight_temp;
	}
	
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.map=arg0;		
	}
		
	@Override
	public String execute() throws Exception {
		System.out.println("in execut emethod of admin update");
		System.out.println("before update "+flight_temp);
		String result=dao.update(flight_temp);
		if(result=="sucess")
			return SUCCESS;
		return ERROR;
	}
}