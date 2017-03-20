package Actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.hib_dao;
import Pojos.HotelPaymentPojos;
import Pojos.RoomPojos;
import Pojos.TempHotelDetailsPojos;

import com.opensymphony.xwork2.ActionSupport;

public class HotelPaymentComplete extends ActionSupport implements SessionAware{
	
	
	hib_dao dao;
	Map<String, Object> map;
	HotelPaymentPojos hp;
	TempHotelDetailsPojos hd;
	ArrayList<RoomPojos> rp;
	public HotelPaymentComplete() {
		System.out.println("in hotel payment complete");
		dao=new hib_dao();
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		map=arg0;
		
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in hotel payment complete execute");
		hp=(HotelPaymentPojos)map.get("userdet");
	hd=(TempHotelDetailsPojos)map.get("firstdet");	
		System.out.println(hp);
		System.out.println("the value of first "+hd);
	rp=	dao.AddHotelUserDetails(hp,hd);
	System.out.println("the no of free rooms "+rp);
	if(rp!=null)
		return SUCCESS;
	return ERROR;
		
	}
	
	
	
	
	

}
