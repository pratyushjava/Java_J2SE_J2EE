package pojos;

//to be used by 
public class UserPOJO {
	private int id;
	private String name;
	private double subAmt;
	public UserPOJO() {
		// TODO Auto-generated constructor stub
	}
	public UserPOJO(int id, String name, double subAmt) {
		super();
		this.id = id;
		this.name = name;
		this.subAmt = subAmt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSubAmt() {
		return subAmt;
	}
	public void setSubAmt(double subAmt) {
		this.subAmt = subAmt;
	}
	@Override
	public String toString() {
		return "User Details  [id=" + id + ", name=" + name + ", subAmt=" + subAmt
				+ "]";
	}
	
	

}
