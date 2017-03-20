package Actions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.hib_dao;
import Pojos.FlightPojos;
import Pojos.PassangerPojos;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Payment  extends ActionSupport implements ModelDriven<PassangerPojos>,SessionAware{
	
	hib_dao dao;
	int i;
	PassangerPojos p=new PassangerPojos();
	Map<String, Object> map;
	double total;
	public Payment() {
		System.out.println("in def constr of payment.........");
		dao=new hib_dao();
	}

	@Override
	public PassangerPojos getModel() {
		// TODO Auto-generated method stub
		return p;
	}
	
	

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.map=arg0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("before execute");
	//System.out.println(((ArrayList<FlightPojos>)map.get("flightdetails")).toString());
		System.out.println("in execute of payment"+p);
	System.out.println("put pojo in session map");
	FlightPojos fp=null;
	ArrayList<FlightPojos> al=(ArrayList<FlightPojos>)map.get("flightdetails");
	for (FlightPojos f : al) {
		if(f.getFlight_id()==p.getFlight_id())
		{
			fp=f;
			break;
		}
	}
	if(fp.getAdult()>p.getAdult() && fp.getChildren()>p.getChildren() && fp.getInfants()>p.getInfants())
	{
		if(p!=null)
		{
			map.put("users", p);
			total=totalFare();
			map.put("totalfare", total);
			
			return SUCCESS;
		}
		
	}
	return ERROR;
		
		
	}
	
	private double totalFare()
	{
		double total1=0;
		double initFare=0;
	ArrayList<FlightPojos> al=	(ArrayList<FlightPojos>)map.get("flightdetails");
	System.out.println("in total fare"+al);
		for (FlightPojos f :al ) {
			if(f.getFlight_id()==p.getFlight_id())
			{
				initFare=f.getFare();
				break;
			}
		}
		int adult=p.getAdult();
		int child=p.getChildren();
		int infants=p.getInfants();
		total1=(adult*initFare)+(child*initFare*0.75)+(infants*initFare*0.50);
		System.out.println("the total fare is"+total1);
		return total1;
	}

}
