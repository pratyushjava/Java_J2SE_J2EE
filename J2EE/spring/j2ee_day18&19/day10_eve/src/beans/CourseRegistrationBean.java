package beans;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import dao.CourseDAO;
import pojos.*;

public class CourseRegistrationBean {
	//private props : course i/ps
	private String cName;
	private int sid;//student id
	private String s1,s2;//string representation of Dates.
	private Date strtDate,endDate;
	private double fees;
	//private props : student i/ps
	private String sName,addr;
	private CourseDAO dao;
	private SimpleDateFormat sdf;

	
	public CourseRegistrationBean() {
		System.out.println("in course bean constr");
		dao=new CourseDAO();
		sdf=new SimpleDateFormat("dd-MMM-yyyy");
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

	
	public Date getEndDate() {
		return endDate;
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
		System.out.println("in add");
		dao.addStudent(cName, s1);
		return "success";
	}
	public Student getDelete() throws Exception
	{
		
		
		
		return dao.deleteStudent(sid);
	}


	public void setS1(String s1) throws Exception{
		this.s1 = s1;
		strtDate=sdf.parse(s1);
	}

	
	public void setS2(String s2) throws Exception{
		this.s2 = s2;
		endDate=sdf.parse(s2);
				
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}

	public List<Student> getStudents() throws Exception
	{
		System.out.println("in get students....");
		return dao.getStudents(cName);
	}

	public List<Student> getDeleteCourse() throws Exception{
		return dao.cancelCourse(cName);
	}
	
	 
	
	

}
