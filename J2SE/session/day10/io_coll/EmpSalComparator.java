package io_coll;

import java.util.Comparator;

public class EmpSalComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return  (int) (o1.getSal()-o2.getSal());
	}

}
