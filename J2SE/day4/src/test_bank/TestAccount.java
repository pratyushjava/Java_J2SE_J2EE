package test_bank;
import accts.*;
import java.util.*;
public class TestAccount
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int counter=0;
int ano=0;
int balance=0;
int count=counter;
System.out.println("enter the total no of account");
Account []acc=new Account[sc.nextInt()];
boolean exit=false;
int flag=0;
while(!exit)
{
System.out.print("press 1 for create account\n press 2 for display account summary\n press 3 for deposit \n press 4 for withdrawal");
System.out.println("\npress 5 for create exit");
int choice=sc.nextInt();
switch(choice)
{
case 1:
		System.out.println("enter accno,name,type of account,balance");
		Account a1=new Account(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
		for(int i=0;i<count;i++)
		{
			if(acc[i].getAccno()==a1.getAccno())
			{
				System.out.println("tis is a duplicate accountno");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			//acc[counter]=new Account(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
			acc[counter]=a1;	
			counter++;
			count=counter;
			System.out.println(acc[counter-1]);
		}
		break;
case 2:
		System.out.println("enter the account no");
		ano=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			if(acc[i].getAccno()==ano)
			{
				System.out.println(acc[i]);
				break;
			}
		}
		break;
case 3:
		System.out.println("enter the accno and ammount you want deposit");
		ano=sc.nextInt();
		balance=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			if(acc[i].getAccno()==ano)
			{
				acc[i].deposit(balance);
				break;
			}
			
		}
		break;
case 4:
		System.out.println("enter the accno and ammount you want withdraw");
		ano=sc.nextInt();
		balance=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			if(acc[i].getAccno()==ano)
			{
				acc[i].withdrawal(balance);
			}
		}
		break;
case 5:
		exit=true;
		break;
}
}
}
}		
				
		
			
