package Pojos;

public class TicketPojos {
	
	private int PNR;
	private int flightid;
	private String firstname;
	private String lastname;
	private double fare;
	private int adult,children,infants;
	
	public TicketPojos() {
		System.out.println("in ticket pojo def constr...........");
	}

	
	public int getFlightid() {
		return flightid;
	}


	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}


	
	public TicketPojos(int pNR, int flightid, String firstname,
			String lastname, double fare, int adult, int children, int infants) {
		super();
		PNR = pNR;
		this.flightid = flightid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.fare = fare;
		this.adult = adult;
		this.children = children;
		this.infants = infants;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	public int getPNR() {
		return PNR;
	}

	public void setPNR(int pNR) {
		PNR = pNR;
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

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
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
	
	

}
