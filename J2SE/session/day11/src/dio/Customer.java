package dio;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Customer {
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
	//writeData --- dout & should write state of cust on bin strm
	public void writeData(DataOutputStream dout) throws Exception
	{
		dout.writeUTF(email);
		dout.writeUTF(name);
		dout.writeDouble(subAmt);
		
	}
	//add readData method to cust class 
	//Customer readData(din)
	public static Customer readData(DataInputStream din) throws Exception
	{
		return new Customer(din.readUTF(), din.readUTF(),din.readDouble());
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
