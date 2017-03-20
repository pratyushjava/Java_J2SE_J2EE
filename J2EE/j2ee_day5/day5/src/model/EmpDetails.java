package model;

import java.util.Date;

public class EmpDetails {
	private String name;
	private double sal;
	private Date joinDate;
	public EmpDetails(String name, double sal, Date joinDate) {
		super();
		this.name = name;
		this.sal = sal;
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "EmpDetails [name=" + name + ", sal=" + sal + ", joinDate="
				+ joinDate + "]";
	}
	

}
