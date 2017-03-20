package emp_util;

import javax.ejb.Remote;

import cust_exc.EmpNotFoundException;

import pojos.EmpPOJO;

@Remote
public interface EmpUtil {
  EmpPOJO getEmpInfo(int id) throws EmpNotFoundException;
}
