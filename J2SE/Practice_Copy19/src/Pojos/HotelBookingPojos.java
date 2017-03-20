package Pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="HOTELBOOKING20")
public class HotelBookingPojos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="BOOKINGID")
	private int bookingid;
	
	@Column(name="PASSANGER_ID")
	private String passangerid;
	
	@Column(name="HOTEL_ID")
	private int Hotelid;
	
	@Column(name="CHECKINDATE")
	private Date checkindate;
	
	@Column(name="CHECKOUTDATE")
	private Date checkoutdate;
	@Column(name="BOOKINGSTATUS")
	String bookingstatus;
	
	@Column(name="FIRSTNAME")
	String firstname;
	
	@Column(name="LASTNAME")
	String lastname;
	
	@Column(name="NO_OF_ROOMS")
	int no_of_rooms;
	
	
	public HotelBookingPojos() {
		System.out.println("in hotel booking pojos def constr.........");
	}


	public int getBookingid() {
		return bookingid;
	}


	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}


	public String getPassangerid() {
		return passangerid;
	}


	public void setPassangerid(String passangerid) {
		this.passangerid = passangerid;
	}


	public int getHotelid() {
		return Hotelid;
	}


	public void setHotelid(int hotelid) {
		Hotelid = hotelid;
	}


	public Date getCheckindate() {
		return checkindate;
	}


	public void setCheckindate(Date checkindate) {
		this.checkindate = checkindate;
	}


	public Date getCheckoutdate() {
		return checkoutdate;
	}


	public void setCheckoutdate(Date checkoutdate) {
		this.checkoutdate = checkoutdate;
	}


	public HotelBookingPojos(String passangerid, int hotelid, Date checkindate,
			Date checkoutdate, String bookingstatus, String firstname,
			String lastname, int no_of_rooms) {
		super();
		this.passangerid = passangerid;
		Hotelid = hotelid;
		this.checkindate = checkindate;
		this.checkoutdate = checkoutdate;
		this.bookingstatus = bookingstatus;
		this.firstname = firstname;
		this.lastname = lastname;
		this.no_of_rooms = no_of_rooms;
	}


	@Override
	public String toString() {
		return "HotelBookingPojos [bookingid=" + bookingid + ", passangerid="
				+ passangerid + ", Hotelid=" + Hotelid + ", checkindate="
				+ checkindate + ", checkoutdate=" + checkoutdate
				+ ", bookingstatus=" + bookingstatus + ", firstname="
				+ firstname + ", lastname=" + lastname + ", no_of_rooms="
				+ no_of_rooms + "]";
	}


	
	
	
	
	

}
