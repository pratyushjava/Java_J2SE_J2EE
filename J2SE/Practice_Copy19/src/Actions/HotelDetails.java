package Actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import DAOS.hib_dao;
import Pojos.HotelPojos;
import Pojos.TempHotelDetailsPojos;


public class HotelDetails extends ActionSupport implements  ModelDriven<TempHotelDetailsPojos>,SessionAware{
	
	hib_dao dao;
	TempHotelDetailsPojos hd=new TempHotelDetailsPojos();
	Map<String, Object> map;
	ArrayList<HotelPojos> al=new ArrayList<>();
	ArrayList<TempHotelDetailsPojos> hd1;
	
	public HotelDetails() {
		System.out.println("in hotel details action def constr............");
		dao=new  hib_dao();
	}
	
	

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.map=arg0;
		
	}



	@Override
	public TempHotelDetailsPojos getModel() {
		// TODO Auto-generated method stub
		System.out.println("in get model...........");
		return hd;
	}



	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in hotel details execute.........");
	al=	dao.getHotelDetails(hd);
	System.out.println("the hote details are"+al);
	if(al.toString()!="[]")
	{
		System.out.println(al);
		map.put("hoteldetails", al);
		map.put("firstdet",hd);
		return SUCCESS;
	}
		return ERROR;
	}
	
	
	
	
	
	

}
