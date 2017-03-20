package emp;
import java.util.*;

import javax.ejb.Remote;

import entities.MyEmp;

@Remote
public interface Employee {
	boolean addEmp(MyEmp m1);
	List<MyEmp> getEmployees();
}
