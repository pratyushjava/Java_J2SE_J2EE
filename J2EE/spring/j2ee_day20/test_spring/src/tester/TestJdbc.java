package tester;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import jdbc_persistence.dao.AccountDAO;
import jdbc_persistence.dao.EmpDAO;
import jdbc_persistence.model.Emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/jdbc_persistence.xml");
		System.out.println("ctx created");
		EmpDAO dao=(EmpDAO) ctx.getBean("empDao");
		System.out.println("dao retrieved");
		System.out.println("Emp list "+dao.getEmps());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dept id and sal lower limit");
		System.out.println("Specific emp list "+dao.getEmpByDeptAndSalary(sc.next(),sc.nextDouble()));
		System.out.println("Enter date dd-mm-yyyy");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		System.out.println("Emps by date "+dao.getEmpByJoinDate(sdf.parse(sc.next())));
		/* insert operation works ---- commented as want to test next block 
		System.out.println("Enter Emp dtls id dept_id name adr sal date");
		dao.insertEmp(new Emp(sc.nextInt(), sc.next(),sc.next(),sc.next(),sc.nextDouble(),sdf.parse(sc.next())));*/
		//testing stored proc
		AccountDAO acct=(AccountDAO) ctx.getBean("acctDao");
		System.out.println("acct dao retrieved");
		System.out.println("Enter SID DID amt");
		acct.updateAccount(sc.nextInt(),sc.nextInt(), sc.nextDouble());
		System.out.println("Enter deptid and inc % ");
		dao.updateSalary(sc.next(), sc.nextDouble());
		System.out.println("Enter empid to remove");
		dao.removeEmp(sc.nextInt());
		System.out.println("over....");

	}

}
