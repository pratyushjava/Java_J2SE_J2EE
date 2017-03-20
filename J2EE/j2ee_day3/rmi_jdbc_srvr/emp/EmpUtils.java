package emp;

import java.rmi.Remote;
import java.rmi.RemoteException;

import cust_exc.EmpInsertionException;
import cust_exc.EmpNotFoundException;

public interface EmpUtils extends Remote {
	String getEmpDtls(int empId) throws RemoteException, EmpNotFoundException;

	// Id,name,addr,sal,deptId, date
	String insertEmpRecord(int id, String nm, String adr, double sal,
			int deptId, String date) throws RemoteException,
			EmpInsertionException;

}
