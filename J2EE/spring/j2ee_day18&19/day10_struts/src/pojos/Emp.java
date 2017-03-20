package pojos;

public class Emp {
	private int id;
	private String name,deptId;
	private double sal;
	public Emp() {
		System.out.println("in emp constr");
	}
	public Emp(int id,String name, String deptId, double sal) {
		
		this.id=id;
		this.name = name;
		this.deptId = deptId;
		this.sal = sal;
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
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	

}
