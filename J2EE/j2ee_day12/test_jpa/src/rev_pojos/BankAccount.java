package rev_pojos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bank_accounts database table.
 * 
 */
@Entity
@Table(name="bank_accounts")
public class BankAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ac_no")
	private int acNo;

	private double bal;

	private String type;

	//bi-directional many-to-one association to BankUser
    @ManyToOne
	@JoinColumn(name="id")
	private BankUser bankUser;

    public BankAccount() {
    }

	public int getAcNo() {
		return this.acNo;
	}

	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}

	public double getBal() {
		return this.bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BankUser getBankUser() {
		return this.bankUser;
	}

	public void setBankUser(BankUser bankUser) {
		this.bankUser = bankUser;
	}
	
}