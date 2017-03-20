package pojos;
import javax.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
@Table(name="B_USERS")
public class BankUser implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int userId;
	@Column(length=10)
	private String name;
	@Column(length=10)
	private String password;
	@OneToMany(fetch=FetchType.EAGER,mappedBy="bankUser")
	private List<BankAccount> accts;
	
	public BankUser() {
		accts=new ArrayList<BankAccount>();
		System.out.println("in bank user constr");
	}
	
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
	

	public List<BankAccount> getAccts() {
		return accts;
	}



	public void setAccts(List<BankAccount> accts) {
		this.accts = accts;
	}



	@Override
	public String toString() {
		return "BankUser [userId=" + userId + ", name=" + name + "]";
	}
	
	

	
	
	
	

}
