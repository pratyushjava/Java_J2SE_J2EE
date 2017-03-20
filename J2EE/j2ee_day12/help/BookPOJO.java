package pojos;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="MY_BOOKS")
public class BookPOJO implements Serializable{
	@SequenceGenerator(name="seq_gen",sequenceName="my_seq")
	@Id
	@GeneratedValue(generator="seq_gen")
	@Column(name="book_id")
	private int bookId;
	@Column(name="book_title")
	private String title;
	private String author;
	private double price;
	
	public BookPOJO() {
		System.out.println("in book pojo constr ");
	}
	public BookPOJO(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book Details [bookId=" + bookId + ", title=" + title + ", author="
				+ author + ", price=" + price + "]";
	}
	
	
	

}
