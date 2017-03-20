package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the items database table.
 * 
 */
@Entity
@Table(name="items")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String dscr;

	private double price;

    public Item() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDscr() {
		return this.dscr;
	}

	public void setDscr(String dscr) {
		this.dscr = dscr;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}