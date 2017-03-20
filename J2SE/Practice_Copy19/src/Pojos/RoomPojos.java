package Pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ROOMS")
public class RoomPojos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ROOM_NO")
	private int roomno;
	
	@Column(name="TYPE_ID")
	private int typeid;
	
	@Column(name="HOTEL_ID")
	private int hotelid;
	
	@Column(name="CHECKINDATE")
	private Date checkindate;
	
	@Column(name="CHECKOUTDATE")
	private Date checkoutdate;
	
	@Column(name="ROOMSTATUS")
	private String roomstatus;
	
	
	public RoomPojos() {
		System.out.println("in rooms pojos def constr.........");
	}


	public int getRoomno() {
		return roomno;
	}


	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}


	public int getTypeid() {
		return typeid;
	}


	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}


	public int getHotelid() {
		return hotelid;
	}


	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
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


	public RoomPojos(int typeid, int hotelid, Date checkindate,
			Date checkoutdate, String roomstatus) {
		super();
		this.typeid = typeid;
		this.hotelid = hotelid;
		this.checkindate = checkindate;
		this.checkoutdate = checkoutdate;
		this.roomstatus = roomstatus;
	}


	@Override
	public String toString() {
		return "RoomPojos [roomno=" + roomno + ", typeid=" + typeid
				+ ", hotelid=" + hotelid + ", checkindate=" + checkindate
				+ ", checkoutdate=" + checkoutdate + ", roomstatus="
				+ roomstatus + "]";
	}


	public String getRoomstatus() {
		return roomstatus;
	}


	public void setRoomstatus(String roomstatus) {
		this.roomstatus = roomstatus;
	}


	

	

	
	
	

}
