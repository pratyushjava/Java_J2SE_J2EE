package emp_impl;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import emp.Employee;
import entities.MyEmp;

@Stateless(mappedName="emp_slsb")
public class EmpSLSBFacade implements Employee {
	@PersistenceContext(unitName="test_pu")
	EntityManager mgr;

	@Override
	public List<MyEmp> getEmployees() {
		// TODO Auto-generated method stub
	
		
		List<MyEmp> l1=mgr.createQuery("SELECT e FROM MyEmp e").getResultList();
		
		System.out.println("l1="+l1+"  "+l1.size());
		return l1;
	}

	@Override
	public boolean addEmp(MyEmp m1) {
		System.out.println("m1="+m1);
		mgr.persist(m1);
		return true;
	}
	

}
