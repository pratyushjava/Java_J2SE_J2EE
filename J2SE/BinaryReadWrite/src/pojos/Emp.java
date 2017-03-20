package pojos;

import java.io.Serializable;
import java.text.SimpleDateFormat;

public class Emp {
	
	private int id;
	private String name;
	private String password;
	//private SimpleDateFormat sdf;
	//private date date;
	
	public Emp() {
	System.out.println("in emp def constr");
	}
	public Emp(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", password=" + password
				+ "]";
	}

	
	

}
