package Actions;

import DAOS.hib_dao;

import com.opensymphony.xwork2.ActionSupport;

public class FullHotelDetails extends ActionSupport{
	
	hib_dao dao;
	int r1;
	
	public int getR1() {
		return r1;
	}

	public void setR1(int r1) {
		this.r1 = r1;
	}

	public FullHotelDetails() {
		// TODO Auto-generated constructor stub
		System.out.println("in full hotel details def constr....");
		dao=new hib_dao();
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	

}
