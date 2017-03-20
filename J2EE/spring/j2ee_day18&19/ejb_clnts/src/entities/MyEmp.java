package entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the MY_EMP database table.
 * 
 */
@Entity
@Table(name="MY_EMP")
public class MyEmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long empid;

	private String addr;

	private String deptid;

    @Temporal( TemporalType.DATE)
	@Column(name="JOIN_DATE")
	private Date joinDate;

	private String name;

	private double salary;

    public MyEmp() {
    }
    

	public MyEmp(String addr, String deptid, Date joinDate, String name,
			double salary) {
		super();
		this.addr = addr;
		this.deptid = deptid;
		this.joinDate = joinDate;
		this.name = name;
		this.salary = salary;
	}


	public long getEmpid() {
		return this.empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	

		public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

		public Date getJoinDate() {
		return this.joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "MyEmp [empid=" + empid + ", name=" + name + ", sal=" + salary
				+ "]";
	}
	

}