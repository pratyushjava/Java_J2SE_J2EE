package pojo;

public class VendorPojo 
{
	private int v_id,phno;
	private String name,city;
	
	public VendorPojo(int v_id, int phno, String name, String city) {
		super();
		this.v_id = v_id;
		this.phno = phno;
		this.name = name;
		this.city = city;
	}

	public int getV_id() 
	{
		return v_id;
	}
	
	/*public String getV_idstr() 
	{
		return ""+v_id;
	}*/
	
	public void setV_id(int v_id)
	{
		this.v_id = v_id;
	}
	
	@Override
	public String toString() {
		return "VendorPojo [v_id=" + v_id + ", phno=" + phno + ", name=" + name
				+ ", city=" + city + "]";
	}

	public int getPhno()
	{
		return phno;
	}
	
	public void setPhno(int phno) 
	{
		this.phno = phno;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity(String city) 
	{
		this.city = city;
	}
	

}
