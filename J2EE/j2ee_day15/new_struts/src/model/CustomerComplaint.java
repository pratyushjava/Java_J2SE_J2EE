package model;

import java.util.Arrays;

public class CustomerComplaint {
	private String name,email,password;//tf,password field
	private String os;//select list
	private String browser;//radio
	private String[] techno;//chkboxes
	private String State,City;//dble select
	private String desc;//ta
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	public String[] getTechno() {
		return techno;
	}
	public void setTechno(String[] techno) {
		this.techno = techno;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password="
				+ password + ", os=" + os + ", browser=" + browser
				+ ", techno=" + Arrays.toString(techno) + ", State=" + State
				+ ", City=" + City + ", desc=" + desc + "]";
	}
	

}
