package Actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import DAOS.hib_dao;
import Pojos.FlightPojos;

import com.opensymphony.xwork2.ActionSupport;

public class GetStatus extends ActionSupport implements SessionAware{
	
	int pnr;
	hib_dao dao;
	FlightPojos flPojos;
	Map<String, Object> map;
	
	public GetStatus() {
		// TODO Auto-generated constructor stub
		System.out.println("in get sttus def constr.....");
		dao=new hib_dao();
	}

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in get status execute");
		flPojos=dao.GetStatus(pnr);
		System.out.println("in get status pojos"+flPojos);
		if(flPojos!=null)
		{
			map.put("flstatus", flPojos);
			return SUCCESS;
		}
			
		return ERROR;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		map=arg0;
		
	}
	
	
	

}
