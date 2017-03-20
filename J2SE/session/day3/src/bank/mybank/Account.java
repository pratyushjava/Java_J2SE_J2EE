package bank.mybank;
public class Account 
{
	//D.M
	private int acctId;
	private String name,type;
	private double bal;
	//id --- auto inc generator
	private static int idCounter=1;
	//paramed constr
	public Account(String nm,String ty,double b)
	{
		acctId=idCounter++;
		name=nm;
		type=ty;
		bal=b;
	}
	//get summary : String
	public String getSummary()
	{
		return "A/C Summary "+acctId+"  "+name+"  "+type+"  "+bal;
	}
	//deposit --- ret update bal
	public double deposit(double amt)
	{
		bal += amt;
		return bal;
	}





}
