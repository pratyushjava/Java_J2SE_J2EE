package jdbc_persistence.dao;

import java.util.Date;
import java.util.List;

import jdbc_persistence.model.Emp;

public interface EmpDAO {
	List<Emp> getEmps();
	List<Emp> getEmpByDeptAndSalary(String deptId,double salLimit);
	List<Emp> getEmpByJoinDate(Date joinDate);
	void insertEmp(Emp e);
	//inc sal of all emps from specified dept
	void updateSalary(String deptId,double percentInc);
	//delete emp by id
	void removeEmp(int empid);

}
