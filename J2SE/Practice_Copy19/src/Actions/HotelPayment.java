package Actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.hib_dao;
import Pojos.FlightPojos;
import Pojos.HotelPaymentPojos;
import Pojos.HotelPojos;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.regexp.internal.recompile;

public class HotelPayment extends ActionSupport implements ModelDriven<HotelPaymentPojos>,SessionAware{
	
	hib_dao dao;
	
	int i;
	Map<String, Object> map;
	double total;
	
	HotelPaymentPojos hp=new HotelPaymentPojos();
	public HotelPayment() {
		System.out.println("in def hotel payment constr......");
		dao=new hib_dao();
		
	}


	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		map=arg0;
		
	}


	@Override
	public HotelPaymentPojos getModel() {
		// TODO Auto-generated method stub
		return hp;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("in hotel payment .......");
	//int a=	dao.AddHotelUserDetails(hp);
		HotelPojos h=null;
		ArrayList<HotelPojos> al=(ArrayList<HotelPojos>)map.get("hoteldetails");
		for (HotelPojos f : al) {
			if(f.getHotelid()==hp.getHotelid())
			{
				h=f;
				break;
			}
		}
		if(hp.getType()==1)
		{
			if(h.getNo_of_ac_rooms()>hp.getNo_of_room())
			{
				if(hp!=null)
				{
					map.put("userdet", hp);
					total=totalFare();
					map.put("totalfare", total);
					
					return SUCCESS;
				}
				
			}
			
		}else
		{
			if(h.getNo_of_ac_rooms()>hp.getNo_of_room())
			{
				if(hp!=null)
				{
					map.put("userdet", hp);
					total=totalFare();
					map.put("totalfare", total);
					
					return SUCCESS;
				}
				
			}
			
		}
		return ERROR;
		
		
		
		//map.put("userdet", hp);
	//System.out.println(a);
	/*if(hp!=null)
		return SUCCESS;
	return ERROR;
		
	*/}
	
	
	private double totalFare()
	{
		double total1=0;
		double initFareAc=0;
		double initFareNonAc=0;
	ArrayList<HotelPojos> al=	(ArrayList<HotelPojos>)map.get("hoteldetails");
	System.out.println("in total fare"+al);
		for (HotelPojos f :al ) {
			if(f.getHotelid()==hp.getHotelid())
			{
				initFareAc=f.getAc_room_price();
				initFareNonAc=f.getNonac_room_price();
				break;
			}
		}
		int nos=hp.getNo_of_room();
		if(hp.getType()==1)
		{
			total1=nos*initFareAc;
		}
		else
		{
			total1=nos*initFareNonAc;
		}
		
		
		System.out.println("the total fare is"+total1);
		return total1;
	}

	
	
	
	
	
	

}
