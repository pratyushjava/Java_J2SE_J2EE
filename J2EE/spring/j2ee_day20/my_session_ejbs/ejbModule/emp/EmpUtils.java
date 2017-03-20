package emp;

import javax.ejb.Remote;

import cust_exc.EmpNotFoundException;

import pojos.EmpPOJO;

@Remote
public interface EmpUtils {
	EmpPOJO getEmpDetails(int id) throws EmpNotFoundException;

}
