package pojos;
 
import java.util.Date;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="B_ACCOUNT")
public class BankAccount implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int acctId;
	@Column(length=10)
	private String type;
	private double bal;
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	@ManyToOne
	@JoinColumn(name="user_id")
	private BankUser bankUser;
	
	public BankAccount() {
		System.out.println("in bank acct constr");
	}
	public int getAcctId() {
		return acctId;
	}
	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public BankUser getBankUser() {
		return bankUser;
	}
	public void setBankUser(BankUser bankUser) {
		this.bankUser = bankUser;
	}
	@Override
	public String toString() {
		return "BankAccount Dtls [acctId=" + acctId + ", type=" + type + ", bal="
				+ bal + ", creationDate=" + creationDate + "]";
	}
	
	

}
