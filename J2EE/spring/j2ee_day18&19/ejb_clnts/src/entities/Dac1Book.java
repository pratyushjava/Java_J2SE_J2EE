package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dac1_books database table.
 * 
 */
@Entity
@Table(name="dac1_books")
public class Dac1Book implements Serializable {
	private static final long serialVersionUID = 1L;

	private String author;

	@Column(name="b_title")
	private String bTitle;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="book_id")
	private int bookId;

	private double price;

    @Temporal( TemporalType.DATE)
	private Date publicationDate;

    public Dac1Book() {
    }

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBTitle() {
		return this.bTitle;
	}

	public void setBTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public int getBookId() {
		return this.bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getPublicationDate() {
		return this.publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	@Override
	public String toString() {
		return "Dac1Book [bTitle=" + bTitle + ", bookId=" + bookId + ", price="
				+ price + "]";
	}
	

}