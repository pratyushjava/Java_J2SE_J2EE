package pojos;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="MY_USERS1")
public class UserPOJO implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String email,pass;
	private double subAmt;
	public UserPOJO() {
		System.out.println("in user pojo constr");
	}
	public UserPOJO(String email, String pass, double subAmt) {
		super();
		this.email = email;
		this.pass = pass;
		this.subAmt = subAmt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public double getSubAmt() {
		return subAmt;
	}
	public void setSubAmt(double subAmt) {
		this.subAmt = subAmt;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "User Details [id=" + id + ", email=" + email + ", pass=" + pass
				+ ", subAmt=" + subAmt + "]";
	}
	

}
