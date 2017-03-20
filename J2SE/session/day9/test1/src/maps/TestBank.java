package maps;
import java.util.*;
import javax.transaction.InvalidTransactionException;
import comps.AcctDateComparator;
public class TestBank {
 
	/**
	 * @param args
	 */
	private HashMap<Integer, Account> accts;
	private Scanner sc;

	public static void main(String[] args) throws Exception {
		// launch the tester appln
		new TestBank().launch();

	}

	public void launch() throws Exception{
		// init collection
		init();
		boolean exit = false;
		sc = new Scanner(System.in);
		Account a = null;
		while (!exit) {
			try {
				System.out.println("Menu");
				System.out.println("1 : Create A/C");// name, type ,bal
				System.out.println("2 : Display A/C summary");// id
				System.out.println("3  : Transfer Funds ");// sid,did,amt
				System.out.println("4 : Close A/C");// ac id
				System.out.println("5 : Apply Interest To Saving A/Cs");
				System.out.println("6 : Display Sorted A/Cs as per ID");
				System.out.println("7 : Display Sorted A/Cs as per Name");
				System.out.println("8 : Display Sorted A/Cs as per Date");
				System.out.println("9 : Exit");
				System.out.println("Enter your option");
				switch (sc.nextInt()) {
				case 1:
					a = createAccount();
					accts.put(a.getId(), a);
					display();
					break;
				case 2:
					System.out.println("Enter A/C Id to view Summary");
					displaySummary(sc.nextInt());
					break;
				case 3:
					System.out.println("Enter src id, dest  Id & amt to transfer ");
					transferFunds(sc.nextInt(), sc.nextInt(), sc.nextDouble());
					System.out.println("Transferred funds successfully");
					display();
					break;
				case 4:
					System.out.println("Enter A/C Id to close Account ");
					closeAccount(sc.nextInt());
					display();
					break;
				case 5:
					System.out
							.println("Applying interest to all saving type a/cs");
					applyInterest();
					display();
					break;
				case 6:
					System.out.println("Sorted A/Cs as per ID");
					// acctd -- Key class's N.O criteria; convert HM---> TM &
					// sorting will occur auto.
					System.out.println(new TreeMap<>(accts));
					break;

				case 7:
					System.out.println("Sorted A/Cs as per Name");
					sortByName();
				
					break;
					
				case 8:
					System.out.println("Sorted A/Cs as per Date");
					sortByDate();
					break;

				case 9:
					exit = true;
					break;

				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private void init() throws Exception{
		accts = new HashMap<>();
		//sample data for testing
		Account a=new Account("bb","saving",1500);
		a.acceptCreationDate("12-Jun-2010");
		a.acceptContactInfo("IN","Pune");
		accts.put(a.getId(), a);
		a=new Account("aa","saving",2500);
		a.acceptCreationDate("12-Jun-2009");
		a.acceptContactInfo("IN","Pune");
		accts.put(a.getId(), a);
		
		a=new Account("bb","saving",1800);
		a.acceptCreationDate("12-Jun-2011");
		a.acceptContactInfo("IN","Pune");
		accts.put(a.getId(), a);
		
		a=new Account("cc","saving",5100);
		a.acceptCreationDate("12-Jun-2000");
		a.acceptContactInfo("IN","Pune");
		accts.put(a.getId(), a);
		System.out.println("orig map ");
		display();
		
	}

	private Account createAccount() throws Exception {
		System.out.println("Enter Name Type Opening Bal");
		Account a = new Account(sc.next(), sc.next(), sc.nextDouble());
		System.out.println("Enter Creation Date in dd-mmm-yyyy format");
		a.acceptCreationDate(sc.next());
		System.out.println("Enter Country n City Code");
		a.acceptContactInfo(sc.next(), sc.next());
		return a;
	}

	private void displaySummary(int acctId) throws Exception {
		if (!accts.containsKey(acctId))
			throw new InvalidTransactionException(
					"A/C Summary Not Found Id Invalid");
		System.out.println(accts.get(acctId));
	}

	private void transferFunds(int sid, int did, double amt) throws Exception {
		if (!accts.containsKey(sid))
			throw new InvalidTransactionException(
					"Tx Failed - Src Id not found");
		if (!accts.containsKey(did))
			throw new InvalidTransactionException(
					"Tx Failed - Dest Id not found");
		accts.get(sid).withdraw(amt);
		accts.get(did).deposit(amt);
	}

	private void closeAccount(int id) throws Exception {
		if (!accts.containsKey(id))
			throw new InvalidTransactionException(
					"A/C Removal Failed --  Id Invalid");
		accts.remove(id);
	}

	private void applyInterest() throws Exception {
		// cant attach Iterator to HM .
		// conver HM---->Collection<Account>
		Collection<Account> acs = accts.values();
		for (Account a : acs)
			if (a.getType().equalsIgnoreCase("saving"))
				a.setBal(a.getBal() + (Account.INTEREST_RATE * a.getBal()));
	}

	private void sortByName() {
		// Maps can be only sorted as per Key criteria
		// For any other sorting
		// HM--> Collection-->ArrayList & then invoke Collections.sort (list)
		// for using value's N.O criteria
		ArrayList<Account> l1 = new ArrayList<>(accts.values());
		Collections.sort(l1);
		System.out.println(l1);
	}

	private void sortByDate() {
		// Maps can be only sorted as per Key criteria
		// For any other sorting criteria
		// HM--> Collection-->ArrayList & then invoke Collections.sort with
		// comparator --
		// for using value's C.O criteria
		ArrayList<Account> l1 = new ArrayList<>(accts.values());
		Collections.sort(l1, new AcctDateComparator());
		System.out.println(l1);
	}
	private void display()
	{
		for (Account a : accts.values())//conveting to the coolestion view by values method and then using iterator
			System.out.println(a);
	}

}
