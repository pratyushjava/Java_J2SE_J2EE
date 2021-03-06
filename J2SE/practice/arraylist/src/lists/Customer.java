package lists;

public class Customer implements Comparable<Customer>{
	
	private int id;
	private String email;
	private int amt;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public Customer(int id, String email, int amt) {
		super();
		this.id = id;
		this.email = email;
		this.amt = amt;
	}

	public Customer(int id) {
		super();
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", amt=" + amt + "]";
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		
		
			Customer c=(Customer)obj;
		
		if(id==c.getId())
		{
			return true;
		}
		else
			return false;
	}
	

	@Override
	public int compareTo(Customer c) {
		System.out.println("in compare to");
		
		return id-c.id;
	}
	

}
