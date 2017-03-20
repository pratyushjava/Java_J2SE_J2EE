package lists;

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
	
	public Customer(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", subAmt=" + subAmt
				+ "]";
	}
	
	
	
	

}
