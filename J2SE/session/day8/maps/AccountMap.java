package maps;

import java.util.*;

public class AccountMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create empty HM
		HashMap<Integer,Account> hm=new HashMap<Integer,Account>();
		//using dyn init of array --- create some a/cs
		Account[] accts={new Account(45,"aa", "sav",2000),new Account(3,"bb", "chk",21000),new Account(150,"cc", "sav",12000)};
		//populate map
		for(Account a  : accts)
			hm.put(a.getId(),a);
		//display map contents --- toString
		System.out.println("HM : "+hm);
		//user i/ps a/c id ---if exists display summary 
		//o.w err msg
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A/c ID for printing summary");
		int id=sc.nextInt();
		if (hm.containsKey(id))//HM will invoke equals method of Integer cls---which has been correctly overridden alrdy (for content equality)...retrn true if hm has a mapping for provided key
		
			System.out.println(hm.get(id));//give reference of the account class.
		else
			System.out.println("Acct doesn't exist....");
		//user enters acct id for removal
		System.out.println("Enter ID for closing a/c");
		id=sc.nextInt();
		//sort a/cs as per id
		if (hm.containsKey(id))
			hm.remove(id);
		else
			System.out.println("Acct doesn't exist....");
		System.out.println("Updated map : upon removal"+hm);
		//update ---xfer funds
		System.out.println("Enter src id dest id & amt");
		id=sc.nextInt();
		int did=sc.nextInt();
		double amt=sc.nextDouble();
		if (hm.containsKey(id)) {
			//withdraw
			hm.get(id).withdraw(amt);
			if (hm.containsKey(did))
				hm.get(did).deposit(amt);
		}
		System.out.println("Updated map "+hm);
		//sort the a/cs as per id
		//Collections.sort(hm);//uncomment this to get compiler err
		TreeMap<Integer,Account> tm=new TreeMap<>(hm);
		System.out.println("sorted map...................  "+tm);//still as per key's N.O criteria
		//disp set of keys
		Set<Integer> keys=hm.keySet();
		System.out.println("key from HM ");
		for (int i : keys)
			System.out.print(i +"  ");
		System.out.println(" \nvals from HM ");
		Collection<Account> acs=hm.values();
		for (Account a : acs)
			System.out.println("~~~~~~~~~~~~~~"+a);
		
		//Map can directly sorted only as per Key's criteria(N.O or C.O)
		//apply interest : sav type a/cs
		for (Account a : acs)
			if (a.getType().equalsIgnoreCase("sav"))
				a.setBal(a.getBal()+100);
		
		System.out.println(" Coll of a/cs "+acs);
		System.out.println(" Map of A/cs  "+hm);
		//disp a/c dtls sorted as per bal
		//convert HM---> Collection<V> --- acs
		ArrayList<Account> l1=new ArrayList<Account>(acs);
		Collections.sort(l1);
		System.out.println("Sorted a/cs as per bal "+l1);
		
		
		
		
		
	}
}
