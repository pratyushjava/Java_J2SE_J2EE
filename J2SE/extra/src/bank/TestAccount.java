package bank;
import java.util.*;
class TestAccount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//accept a/c dtls from user & create a/c inst
		System.out.println("Enter the number of users and their respective details");
		Account[] a=new Account[sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the user deatils");
			a[i]=new Account(sc.next(),sc.next(),sc.nextDouble());
		}
		//print a/c summary
		for(Account acc: a)
		{
			System.out.println(acc.getSummary());
		}
		
		
	}
}
