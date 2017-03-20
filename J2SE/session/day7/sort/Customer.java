package sort;

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
	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", subAmt=" + subAmt
				+ "]";
	}
	
	@Override
	public int compareTo(Customer c)
	{
		System.out.println("in compare to");
		//id based criteria
		return id-c.id;
	}
	
	

}
