package Pojos;

public class HotelPaymentPojos {
	
	
	private int hotelid;
	private int no_of_room;
	private String firstname,lastname;
	private int type;
	private String emailid,password;
	
	public HotelPaymentPojos() {
		System.out.println("in def hotel payment pojos.......");
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


	public HotelPaymentPojos(int hotelid, int no_of_room, String firstname,
			String lastname, int type, String emailid, String password) {
		super();
		this.hotelid = hotelid;
		this.no_of_room = no_of_room;
		this.firstname = firstname;
		this.lastname = lastname;
		this.type = type;
		this.emailid = emailid;
		this.password = password;
	}


	public int getHotelid() {
		return hotelid;
	}

	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}

	public int getNo_of_room() {
		return no_of_room;
	}

	public void setNo_of_room(int no_of_room) {
		this.no_of_room = no_of_room;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "HotelPaymentPojos [hotelid=" + hotelid + ", no_of_room="
				+ no_of_room + ", firstname=" + firstname + ", lastname="
				+ lastname + ", type=" + type + ", emailid=" + emailid
				+ ", password=" + password + "]";
	}

	
	
	
	

}
