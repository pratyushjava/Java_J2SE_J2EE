package tester;
import java.util.*;
import bank.mybank.Account;
class TestAccount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//accept a/c dtls from user & create a/c inst
		Account ref=new Account(sc.next(),sc.next(),sc.nextDouble());
		//print a/c summary
		System.out.println(ref.getSummary());
	}
}
