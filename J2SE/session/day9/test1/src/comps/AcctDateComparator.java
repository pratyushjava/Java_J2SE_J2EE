package comps;

import java.util.Comparator;
import maps.Account;

public class AcctDateComparator implements Comparator<Account> {

	@Override
	public int compare(Account arg0, Account arg1) {
		// TODO Auto-generated method stub
		return arg0.getCreationDate().compareTo(arg1.getCreationDate());//calling compare to of date
	}
	

}
