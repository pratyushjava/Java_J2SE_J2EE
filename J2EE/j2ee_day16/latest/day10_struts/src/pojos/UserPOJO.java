package pojos;

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
	public String getName() {
		return name;
	}
	public double getSubAmt() {
		return subAmt;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSubAmt(double subAmt) {
		this.subAmt = subAmt;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", subAmt=" + subAmt
				+ "]";
	}
	
}
