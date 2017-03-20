package dao;

import java.util.ArrayList;

import pojos.Emp;

public class EmpManagerDAO {
	private static ArrayList<Emp> emps;
	public static int idCounter=1;
	static {
		emps=new ArrayList<Emp>();
		emps.add(new Emp(idCounter++, "aa","RND",1000));
		emps.add(new Emp(idCounter++, "bb","RND",2000));
		emps.add(new Emp(idCounter++, "cc","HRD",3000));
	}
	
	public static void add(Emp e)
	{
		e.setId(idCounter++);
		emps.add(e);
	}
	public static ArrayList<Emp> listEmps()
	{
		return emps;
	}

}
