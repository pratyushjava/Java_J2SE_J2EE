package lists;

public class Customer implements Comparable<Customer>{
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
	
	public Customer(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", subAmt=" + subAmt
				+ "]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in equals");
		if (o instanceof Customer) {
			return id == ((Customer)o).id;
		}
		return false;
		
	}

	public double getSubAmt() {
		return subAmt;
	}

	public void setSubAmt(double subAmt) {
		this.subAmt = subAmt;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return id-o.id;//use it only for smaller range of cust id vals
		//must replace it by actual comparison for larger vals.
	}
	
	
	
	
	

}
