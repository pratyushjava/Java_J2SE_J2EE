package maps;

import java.text.SimpleDateFormat;
import java.util.*;

import javax.transaction.InvalidTransactionException;
//import cust_exc.InvalidTransactionException;

import cust_exc.InvalidInputException;



public class Account implements Comparable<Account> {

	public static String DATE_ACCEPT_FORMAT;
	private static int idCounter, step;
	private static SimpleDateFormat sdf;
	private static double MIN_BALANCE;
	private static Date THRESHOLD_DATE;
	public static double INTEREST_RATE;
	private int id;
	private String name,type;
	private double bal;
	private Date creationDate;
	private Address contactInfo;
	
	static {
		idCounter = 100;
		step = 5;
		DATE_ACCEPT_FORMAT="dd-MMM-yyyy";
		sdf=new SimpleDateFormat(DATE_ACCEPT_FORMAT);
		MIN_BALANCE=500;
		THRESHOLD_DATE=new GregorianCalendar(2000,0,1).getTime();
		INTEREST_RATE=0.1;//10%
	}

	public Account(String name, String type, double bal) throws Exception {
		super();
		id=idCounter;
		idCounter+= step;
		this.name = name;
		setType(type);
		setBal(bal);
	}

	@Override
	public int compareTo(Account arg0) {
		// name based sorting --- Natural ordering
		return name.compareTo(arg0.name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) throws Exception {
		try {
			AcctType tp = AcctType.valueOf(type.toUpperCase());
			this.type = type;
		} catch (Exception e) {
			throw new InvalidInputException("Invalid Acct Type : Must be of Type " +Arrays.toString(AcctType.values()));
		}
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) throws Exception{
		if (bal < MIN_BALANCE)
			throw new InvalidInputException(" Opening bal Must be >"+MIN_BALANCE);
		this.bal = bal;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void acceptCreationDate(String s) throws Exception
	{
		//System.out.println("date str "+s);
		creationDate=sdf.parse(s);
		if (creationDate.before(THRESHOLD_DATE))
			throw new InvalidInputException("Creation Date Must be After 1-1-2000" );
	}
	
	public void acceptContactInfo(String co,String city) 
	{
		contactInfo=new Address(co, city);
	}
	
	public void withdraw(double amt) throws Exception
	{
		if ((bal - amt) < MIN_BALANCE)
			throw new InvalidTransactionException("Transfer funds failure -- A/c Overdrawn");
		bal -=amt;
	}
	public void deposit(double amt) 
	{
		bal += amt;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", type=" + type
				+ ", bal=" + bal + "\n " + contactInfo +" \nCreation Date "+sdf.format(creationDate)+ "]";
	}

	//Inner class def.
	private class Address
	{
		private String country,city;

		public Address(String country, String city) {
			super();
			this.country = country;
			this.city = city;
		}

		@Override
		public String toString() {
			return " country=" + country + ", city=" + city ;
		}
		
	}
	

}
