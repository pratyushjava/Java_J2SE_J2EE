package Pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="HOTELUSERS")
public class HotelUsersPojos {
	
	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userid;
	
	@Column(name="EMAILID")
	private String emailid;
	
	@Column(name="PASSWORD")
	private String password;

	public HotelUsersPojos() {
		System.out.println("in hotel users pojo def constr........");
	}

	public HotelUsersPojos( String emailid, String password) {
		super();
		
		this.emailid = emailid;
		this.password = password;
	}

	@Override
	public String toString() {
		return "HotelUsersPojos [userid=" + userid + ", emailid=" + emailid
				+ ", password=" + password + "]";
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
