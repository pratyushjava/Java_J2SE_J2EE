package Pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="City20")
public class CityPojos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="City_id")
	private int cityid;
	
	@Column(name="City_Name")
	private String cityname;
	
	
	public CityPojos() {
		System.out.println("in city pojos def constr........");
	}


	public int getCityid() {
		return cityid;
	}


	public void setCityid(int cityid) {
		this.cityid = cityid;
	}


	public String getCityname() {
		return cityname;
	}


	public void setCityname(String cityname) {
		this.cityname = cityname;
	}


	@Override
	public String toString() {
		return "CityPojos [cityid=" + cityid + ", cityname=" + cityname + "]";
	}


		
	

}
