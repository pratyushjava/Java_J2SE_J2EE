package Pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Passangers")
public class PassangerPojos implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Passanger_Id")
	private int PassangerId;
	
	private String firstname;
	private String lastname;
	private String emailid;
	private String password;
	private int phoneno;
	private int secondaryphoneno;
	private int flight_id;
	private int adult,children,infants;
	
	public PassangerPojos() {
		System.out.println("in passanger pojos def constr");
	}

	public PassangerPojos(String firstname, String lastname, String emailid,
			String password, int phoneno, int secondaryphoneno, int adult,
			int children, int infants) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.password = password;
		this.phoneno = phoneno;
		this.secondaryphoneno = secondaryphoneno;
		this.adult = adult;
		this.children = children;
		this.infants = infants;
	}

	public int getPassangerId() {
		return PassangerId;
	}

	public void setPassangerId(int passangerId) {
		PassangerId = passangerId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public int getSecondaryphoneno() {
		return secondaryphoneno;
	}

	public void setSecondaryphoneno(int secondaryphoneno) {
		this.secondaryphoneno = secondaryphoneno;
	}

	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public int getAdult() {
		return adult;
	}

	public void setAdult(int adult) {
		this.adult = adult;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public int getInfants() {
		return infants;
	}

	public void setInfants(int infants) {
		this.infants = infants;
	}

	@Override
	public String toString() {
		return "PassangerPojos [PassangerId=" + PassangerId + ", firstname="
				+ firstname + ", lastname=" + lastname + ", emailid=" + emailid
				+ ", password=" + password + ", phoneno=" + phoneno
				+ ", secondaryphoneno=" + secondaryphoneno + ", flight_id="
				+ flight_id + ", adult=" + adult + ", children=" + children
				+ ", infants=" + infants + "]";
	}

	
}
