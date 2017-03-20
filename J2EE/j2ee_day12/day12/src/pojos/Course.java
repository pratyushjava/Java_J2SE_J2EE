package pojos;

import java.io.Serializable;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "GRAD_COURSES", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Course implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private props
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	private String name;
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	private double fees;
	@OneToMany(mappedBy = "myCourse")
	private List<Student> students = new ArrayList<Student>();

	// def contr

	public Course() {
		System.out.println("in course constr");
	}

	public Course(String name, Date startDate, Date endDate, double fees) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fees = fees;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	// ensure that Course's toString doesn't print student details
	// print it only when required.
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name
				+ ", startDate=" + startDate + ", endDate=" + endDate
				+ ", fees=" + fees + "]";
	}

}
