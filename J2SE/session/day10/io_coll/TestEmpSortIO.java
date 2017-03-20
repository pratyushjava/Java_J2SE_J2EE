package io_coll;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.TreeSet;

public class TestEmpSortIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// CREATE EMPTY HS
		HashSet<Emp> hs=new HashSet<>();
		//populate
		Emp[] emps={new Emp(101,"aa", 1010),new Emp(16,"aa1", 4010),new Emp(55,"aa", 10010)};
		for (Emp e : emps)
			System.out.println("Added "+hs.add(e));
		Emp e=new Emp(101,"bb", 5010);
		System.out.println("Added "+hs.add(e));

		//sort emps as per ID
		TreeSet<Emp> ts1=new TreeSet<>(hs);
		System.out.println("sorted TS as per id "+ts1);
		
		//sort emp as per sal
		TreeSet<Emp> ts2=new TreeSet<>(new EmpSalComparator());
		ts2.addAll(hs);
		System.out.println("sorted TS as per sal "+ts2);
		//i/o
		PrintWriter pw1=null;
		PrintWriter pw2=null;
		try 
		{
			pw1=new PrintWriter(new FileWriter("emp_id.txt"),true);
			pw2=new PrintWriter(new FileWriter("emp_sal.txt"),true);
			for(Emp e2 : ts1)
				pw1.println(e2);
			for(Emp e2 : ts2)
				pw2.println(e2);
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			if (pw1 != null)
				pw1.close();
			if (pw2 != null)
				pw2.close();
			
		}
		
	}

}
