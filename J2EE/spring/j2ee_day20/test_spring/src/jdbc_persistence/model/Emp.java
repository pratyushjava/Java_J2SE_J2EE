package jdbc_persistence.model;

import java.util.Date;

public class Emp {
	private int id;
	private String name,addr,deptId;
	private double sal;
	private Date joinDate;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String deptId, String name, String addr, double sal) {
		super();
		this.id = id;
		this.deptId = deptId;
		this.name = name;
		this.addr = addr;
		this.sal = sal;
	}
	
	
	public Emp(int id, String name, String addr, String deptId, double sal,
			Date joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.deptId = deptId;
		this.sal = sal;
		this.joinDate = joinDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		System.out.println("in set join date");
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", deptId=" + deptId + ", name=" + name
				+ ", addr=" + addr + ", sal=" + sal + "]";
	}
	
	

}
