package Pojos;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FLIGHTS")
public class FlightPojos implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Flight_Id")
	private int flightid;
	
	@Column(name="SOURCE")
	private int to;
	
	@Column(name="DESTINATION")
	private int from;
	
	
	private double fare;
	
	@Column(name="STATUS")
	private String status;
	
	
	private String departdate;
	private String arrivaldate;
	
	@Column(name="DEPARTTIME")
	private Date departtime;
	
	public Date getDeparttime() {
		return departtime;
	}




	public void setDeparttime(Date departtime) {
		this.departtime = departtime;
	}




	@Column(name="ARRIVALTIME")
	private Date arrivaltime;
	
	
	
	



	



	public Date getArrivaltime() {
		return arrivaltime;
	}




	public void setArrivaltime(Date arrivaltime) {
		this.arrivaltime = arrivaltime;
	}




	@Column(name="ADULTSNO")
	private int adult;
	
	@Column(name="CHILDNO")
	private int children;
	
	@Column(name="INFANTSNO")
	private int infants;
	
	
	

	



	@Override
	public String toString() {
		return "FlightPojos [flightid=" + flightid + ", to=" + to + ", from="
				+ from + ", fare=" + fare + ", status=" + status
				+ ", departdate=" + departdate + ", arrivaldate=" + arrivaldate
				+ ", departtime=" + departtime + ", arrivaltime=" + arrivaltime
				+ ", adult=" + adult + ", children=" + children + ", infants="
				+ infants + "]";
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public int getFlight_id() {
		return flightid;
	}




	public void setFlight_id(int flight_id) {
		this.flightid = flight_id;
	}




	public int getTo() {
		return to;
	}




	public void setTo(int to) {
		this.to = to;
	}




	public int getFrom() {
		return from;
	}




	public void setFrom(int from) {
		this.from = from;
	}




	public double getFare() {
		return fare;
	}




	public void setFare(double fare) {
		this.fare = fare;
	}




	public String getDepartdate() {
		return departdate;
	}




	public void setDepartdate(String departdate) {
		this.departdate = departdate;
	}




	public String getArrivaldate() {
		return arrivaldate;
	}




	public void setArrivaldate(String arrivaldate) {
		this.arrivaldate = arrivaldate;
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




	public FlightPojos() {
	System.out.println("in def pojos constructor");
	}
	
		

}
