package serial;

import java.io.Serializable;


public class Customer implements Serializable{
	private String email, name;
	private double subAmt;
	public Customer(String email, String name, double subAmt) {
		super();
		this.email = email;
		this.name = name;
		this.subAmt = subAmt;
	}
	@Override
	public String toString() {
		return "Customer [email=" + email + ", name=" + name + ", subAmt="
				+ subAmt + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	
	
}
