package emp_actions;

import java.util.ArrayList;

import pojos.Emp;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.EmpManagerDAO;

public class EmpAction extends ActionSupport implements ModelDriven<Emp>{
	private Emp emp;
	private ArrayList<Emp> empList;
	@Override
	public Emp getModel() {
		// return empty Emp inst
		emp=new Emp();
		return emp;
	}
	//list emp action
	public String list() throws Exception
	{
		empList=EmpManagerDAO.listEmps();
		return SUCCESS;
	}
	//add emp action
	public String add() throws Exception
	{
		EmpManagerDAO.add(emp);
		return SUCCESS;
	}
	//getters & setters
	public Emp getEmp() {
		System.out.println("in get emp");
		return emp;
	}
	public void setEmp(Emp emp) {
		System.out.println("in set emp");
		this.emp = emp;
	}
	public ArrayList<Emp> getEmpList() {
		System.out.println("in get empList");
		return empList;
	}
	public void setEmpList(ArrayList<Emp> empList) {
		System.out.println("in set empList");
		this.empList = empList;
	}
	

}
