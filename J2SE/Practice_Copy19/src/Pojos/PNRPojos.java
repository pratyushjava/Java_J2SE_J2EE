package Pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PNRTABLE20")
public class PNRPojos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int PNR;
	
	@Column(name="Passanger_Id")
	private String passangerid;
	
	@Column(name="Flight_Id")
	private int flightid;
	
	@Column(name="FIRSTNAME")
	String firstname;
	
	@Column(name="LASTNAME")
	String lastname;
	
	@Column(name="ADULTS")
	int adult;
	
	@Column(name="CHILDREN")
	int children;
	
	@Column(name="INFANTS")
	int infants;
	
	
	public PNRPojos() {
		System.out.println("in def constr of pojos");
	}


	public int getPNR() {
		return PNR;
	}


	public void setPNR(int pNR) {
		PNR = pNR;
	}


	public String getPassangerid() {
		return passangerid;
	}


	public void setPassangerid(String passangerid) {
		this.passangerid = passangerid;
	}


	public int getFlightid() {
		return flightid;
	}


	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}


	@Override
	public String toString() {
		return "PNRPojos [PNR=" + PNR + ", passangerid=" + passangerid
				+ ", flightid=" + flightid + "]";
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


	public PNRPojos(String passangerid, int flightid, String firstname,
			String lastname, int adult, int children, int infants) {
		super();
		this.passangerid = passangerid;
		this.flightid = flightid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.adult = adult;
		this.children = children;
		this.infants = infants;
	}
	
	
	
	
	
	

}
