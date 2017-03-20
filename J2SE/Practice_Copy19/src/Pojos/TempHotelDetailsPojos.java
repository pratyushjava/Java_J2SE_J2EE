package Pojos;

import java.util.Date;

public class TempHotelDetailsPojos {
	
	
	private int city;
	private String checkindate;
	private String checkoutdate;
	private int type;
	private int no_of_rooms;
	private double price;
	
	public TempHotelDetailsPojos() {
		System.out.println("in temp hote details pojo def constr.......");
	}

	
	public TempHotelDetailsPojos(int city, String checkindate,
			String checkoutdate, int type, int no_of_rooms, double price) {
		super();
		this.city = city;
		this.checkindate = checkindate;
		this.checkoutdate = checkoutdate;
		this.type = type;
		this.no_of_rooms = no_of_rooms;
		this.price = price;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public String getCheckindate() {
		return checkindate;
	}

	public void setCheckindate(String checkindate) {
		this.checkindate = checkindate;
	}

	public String getCheckoutdate() {
		return checkoutdate;
	}

	public void setCheckoutdate(String checkoutdate) {
		this.checkoutdate = checkoutdate;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getNo_of_rooms() {
		return no_of_rooms;
	}

	public void setNo_of_rooms(int no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
	}

	@Override
	public String toString() {
		return "TempHotelDetailsPojos [city=" + city + ", checkindate="
				+ checkindate + ", checkoutdate=" + checkoutdate + ", type="
				+ type + ", no_of_rooms=" + no_of_rooms + "]";
	}
	
	

}
