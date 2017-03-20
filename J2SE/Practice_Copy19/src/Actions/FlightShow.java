package Actions;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.catalina.connector.Request;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.tiles.access.TilesAccess;
import org.hibernate.Session;

import DAOS.hib_dao;
import Pojos.FlightPojos;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class FlightShow  extends ActionSupport implements SessionAware,ModelDriven<FlightPojos>{
	
	
	hib_dao dao;
	ArrayList<FlightPojos> al=null;
	Map<String, Object> map;
	FlightPojos f=new FlightPojos();
	int r1;
	
	public int getR1() {
		return r1;
	}


	public void setR1(int r1) {
		this.r1 = r1;
	}

	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	
	
	
	
	
	@Override
	public FlightPojos getModel() {
		// TODO Auto-generated method stub
		System.out.println("in model");
		System.out.println("the to d id"+f.getTo());
		System.out.println("the depart date"+f.getDepartdate());
		System.out.println("the from id"+ f.getFrom());
		System.out.println("the arrival date"+f.getArrivaldate());
		System.out.println("the adult no"+f.getAdult());
		System.out.println("the chil dno"+f.getChildren());
		System.out.println("the infants no"+f.getInfants());
		return f;
	}


	@Override
	public void setSession(Map<String, Object> arg0) {
		
		this.map=arg0;
	}

	
	public FlightShow() {
		System.out.println("in flight show def constr......");
		dao=new hib_dao();
	}
	
	

	public hib_dao getDao() {
		return dao;
	}

	public void setDao(hib_dao dao) {
		this.dao = dao;
	}

	@Override
	public String execute() throws Exception {
	
		System.out.println("in execute starting");
		System.out.println("the to d id"+f.getTo());
		System.out.println("the depart date"+f.getDepartdate());
		System.out.println("the from id"+ f.getFrom());
		System.out.println("the arrival date"+f.getArrivaldate());
		System.out.println("the adult no"+f.getAdult());
		System.out.println("the chil dno"+f.getChildren());
		System.out.println("the infants no"+f.getInfants());
		System.out.println("the value of r1 "+r1);
		try
		{
			String todate =getConvertedDate(f.getDepartdate());
			
			System.out.println("the to date is"+todate);
			
		
		if(r1==1)
		{
			
			al=dao.getOneWayFlightDetails(f.getTo(),f.getFrom(), todate, f.getAdult(), f.getChildren(), f.getInfants());
			System.out.println(al);
			
		}else
		{
			String fromdate=getConvertedDate(f.getArrivaldate());
			al=dao.getRoundTripFlightDetails(f.getTo(), f.getFrom(), todate, fromdate, f.getAdult(), f.getChildren(), f.getInfants());
			System.out.println("in else pasrt , the round trip fight pojo"+al);
			
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		if(al.toString()!="[]")
		{
			System.out.println("in if");
			System.out.println(al);
			map.put("flightdetails", al);
			
			return SUCCESS;
		}
		System.out.println("in error");
		return ERROR;
	}
	
	
	private String getConvertedDate(String dd)
	{
		String str="";
		StringTokenizer stk=new StringTokenizer(dd, "-");
		while(stk.hasMoreTokens())
		{
		str=stk.nextToken()+"-"+str;
		}
		System.out.println(str);
		StringBuffer  sb=new StringBuffer(str);
		sb.deleteCharAt(10);
		System.out.println("in conversion fun"+sb.toString());
		return sb.toString();
		
	}
	
	
	

}
