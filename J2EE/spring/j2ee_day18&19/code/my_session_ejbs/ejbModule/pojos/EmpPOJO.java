package pojos;

import java.io.Serializable;

//pojo will be sent to clnt on the net --- SO MUST implement 
//Serializable
public class EmpPOJO implements Serializable{
	private int id;
	private String name;
	private double sal;
	public EmpPOJO() {
		// TODO Auto-generated constructor stub
	}
	
	public EmpPOJO(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "EmpPOJO [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
