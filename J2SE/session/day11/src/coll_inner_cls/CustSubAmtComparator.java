package coll_inner_cls;

import java.util.Comparator;

public class CustSubAmtComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		//sorted as per subAmt
		return (int)(o1.getSubAmt()-o2.getSubAmt());
	}

}
