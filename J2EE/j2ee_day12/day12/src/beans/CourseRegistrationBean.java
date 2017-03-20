package beans;
import java.sql.Date;

import dao.CourseDAO;
import pojos.*;

public class CourseRegistrationBean {
	//private props : course i/ps
	private String cName;
	private String s1,s2;//string representation of Dates.
	private Date strtDate,endDate;
	private double fees;
	//private props : student i/ps
	private String sName,addr;
	private CourseDAO dao;
	
	public CourseRegistrationBean() {
		System.out.println("in course bean constr");
		dao=new CourseDAO();
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Date getStrtDate() {
		return strtDate;
	}

	public void setStrtDate(Date strtDate) {
		this.strtDate = strtDate;
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

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	//s1,s2
	

		//B.L methods
	public String getCourse() throws Exception
	{
		Course c1=new Course(cName, strtDate, endDate, fees);//transient
		dao.addCourse(c1);
		return "success";
	}
	public String getStud() throws Exception
	{
		Student s1=new Student(sName, addr);
		
		dao.addStudent(cName, s1);
		return "success";
	}
	public Student getDelete() throws Exception
	{
		
		
		
		return dao.deleteStudent(sName);
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
		strtDate=Date.valueOf(s1);
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
		endDate=Date.valueOf(s2);
	}
	

}
