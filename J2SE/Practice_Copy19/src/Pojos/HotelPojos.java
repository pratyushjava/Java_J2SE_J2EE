package Pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HOTELS")
public class HotelPojos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Hotel_Id")
	private int hotelid;
	
	@Column(name="Hotel_Name")
	private String hotelname;
	
	@Column(name="Location")
	private String location;
	
	@Column(name="City_Id")
	private int city;
	
	
	@Column(name="NO_OF_AC_ROOMS")
	int no_of_ac_rooms;
	
	@Column(name="NO_OF_NONAC_ROOMS")
	int no_of_nonac_rooms;
	
	@Column(name="AC_ROOM_PRICE")
	double ac_room_price;
	
	@Column(name="NONAC_ROOM_PRICE")
	double nonac_room_price;
	
	public HotelPojos() {
		System.out.println("in hotel pojos def constr.....");
	}
	
	
	





	







	public double getAc_room_price() {
		return ac_room_price;
	}
















	public void setAc_room_price(double ac_room_price) {
		this.ac_room_price = ac_room_price;
	}
















	public double getNonac_room_price() {
		return nonac_room_price;
	}
















	public void setNonac_room_price(double nonac_room_price) {
		this.nonac_room_price = nonac_room_price;
	}
















	public HotelPojos(String hotelname, String location, int city,
			int no_of_ac_rooms, int no_of_nonac_rooms, double ac_room_price,
			double nonac_room_price) {
		super();
		this.hotelname = hotelname;
		this.location = location;
		this.city = city;
		this.no_of_ac_rooms = no_of_ac_rooms;
		this.no_of_nonac_rooms = no_of_nonac_rooms;
		this.ac_room_price = ac_room_price;
		this.nonac_room_price = nonac_room_price;
	}
















	public int getHotelid() {
		return hotelid;
	}

	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}








	







	@Override
	public String toString() {
		return "HotelPojos [hotelid=" + hotelid + ", hotelname=" + hotelname
				+ ", location=" + location + ", city=" + city
				+ ", no_of_ac_rooms=" + no_of_ac_rooms + ", no_of_nonac_rooms="
				+ no_of_nonac_rooms + ", ac_room_price=" + ac_room_price
				+ ", nonac_room_price=" + nonac_room_price + "]";
	}
















	public int getNo_of_ac_rooms() {
		return no_of_ac_rooms;
	}








	public void setNo_of_ac_rooms(int no_of_ac_rooms) {
		this.no_of_ac_rooms = no_of_ac_rooms;
	}








	public int getNo_of_nonac_rooms() {
		return no_of_nonac_rooms;
	}








	public void setNo_of_nonac_rooms(int no_of_nonac_rooms) {
		this.no_of_nonac_rooms = no_of_nonac_rooms;
	}

	
	

}
