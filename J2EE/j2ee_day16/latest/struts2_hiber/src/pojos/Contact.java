package pojos;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="CONTACTS")
public class Contact implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email_id")
	private String emailId;
	@Column(name="cell_no")
	private String cellNo;
	@Column(name="birth_date")
	private Date birthDate;
	@Column(name="web_site")
	private String website;
	@Column(name="created")
	private Date created;

	public Contact() {
		System.out.println("in contact constr");
	}
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public String getCellNo() {
		return cellNo;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public String getWebsite() {
		return website;
	}
	
	public Date getCreated() {
		return created;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setCellNo(String cellNo) {
		this.cellNo = cellNo;
	}
	public void setBirthDate(Date birthDate) {
		System.out.println("date "+birthDate);
		this.birthDate = birthDate;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
}
