package Pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ROOMTYPE")
public class TypePojos {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TYPE_ID")
	private int typeid;
	
	@Column(name="TYPE_NAME")
	private String typename;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="NO_OF_ROOMS")
	private int no_of_rooms;
	
	public TypePojos() {
		System.out.println("in type pojos def constr.....");
	}

	public int getTypeid() {
		return typeid;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNo_of_rooms() {
		return no_of_rooms;
	}

	public void setNo_of_rooms(int no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
	}

	public TypePojos(String typename, double price, int no_of_rooms) {
		super();
		this.typename = typename;
		this.price = price;
		this.no_of_rooms = no_of_rooms;
	}

	@Override
	public String toString() {
		return "TypePojos [typeid=" + typeid + ", typename=" + typename
				+ ", price=" + price + ", no_of_rooms=" + no_of_rooms + "]";
	}

		
	

}
