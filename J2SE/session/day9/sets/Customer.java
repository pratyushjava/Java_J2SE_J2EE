package sets;

public class Customer {
	private int id;
	private String email,name;
	private double subAmt;
	public Customer(int id, String email, String name, double subAmt) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.subAmt = subAmt;
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", subAmt=" + subAmt
				+ "]";
	}
	
	

	public double getSubAmt() {
		return subAmt;
	}

	public void setSubAmt(double subAmt) {
		this.subAmt = subAmt;
	}

	@Override
	public boolean equals(Object o)
	{
		System.out.println("in equals");
		if(o instanceof Customer)
			return id==((Customer)o).id;
		return false;
		//cust is uniqule identified by id & email
	/*	if (o instanceof Customer){
			Customer c=(Customer)o;
			return (id == c.id) && email.equals(c.email);
		}
		return false;*/
	}
	@Override
	public int hashCode()
	{
		System.out.println("in hc");
		return 17*id;
	//	return 23*id*email.hashCode();
	}
	
	
	
	

}
