package bean;

import java.util.ArrayList;

import dao.VenderDao;
import pojo.VendorPojo;
public class VendorBean
{
	int v_id;
	VenderDao vdao=null;
	
	
	
	
	public int getV_id() {
		return v_id;
	}

	public void setV_id(int v_id) {
		this.v_id = v_id;
		System.out.println("in bean"+v_id);
	}

	public VendorBean()
	{
		vdao=new VenderDao();
		
	}
	
	public ArrayList<VendorPojo> dispAll()
	{
		System.out.println("In dispAll() of bean class");
		return vdao.displayAll(); 
	}
	
	public int deleteId(int v_id)
	{
		System.out.println("in bean"+v_id);
		return vdao.deleteId(v_id);
	}
	
	
	public Boolean insertVal(int id, int phoneno, String name, String city) 
	{
		return vdao.InsertVendor(id, phoneno, name, city);
	}
	

	

}
