package AdminPojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMINS")
public class AdminUserPojos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ADMINID")
	private int adminid;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="PASSWORD")
	private String password;
	
	public AdminUserPojos() {
		System.out.println("in def pojo constr............");
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminUserPojos [adminid=" + adminid + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	

}
