package pojos;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="stud_tbl")
public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	@Column(unique=true)
	private String name;
	private String addr;
	@ManyToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST})//,fetch=FetchType.EAGER)
	@JoinColumn(name="courseId",nullable=false)
	private Course myCourse;
	
	public Student() {
		System.out.println("in stud constr");
	}

	public Student(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Course getMyCourse() {
		return myCourse;
	}

	public void setMyCourse(Course myCourse) {
		this.myCourse = myCourse;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", addr="
				+ addr +" courseName="+myCourse.getName()+ "]";
	}
	
	

}
