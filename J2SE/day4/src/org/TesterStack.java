package org;
import stack.*;
import java.util.*;
public class TesterStack 
{
public static void main(String [] arr)
{
	Scanner sc=new Scanner(System.in);
	boolean b=false;
	Emp e=null;
	StackEmp s=null;
	System.out.println("press 1 for fixed array \n press 2 for growable array");
	int ch=sc.nextInt();
	switch(ch)
	{
		case 1:
				System.out.println("enter the length of the fixed stack");
				int l=sc.nextInt();
				s=new Fixed(l);
				break;
		case 2:
				s=new Growable();
				break;
	}
	while(!b)
	{
		System.out.println("press 1 for push \n press 2 for pop \n press 3 for exit");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
					System.out.println("enter the id,name,basic salary of the employee");
					s.push(new Emp(sc.nextInt(),sc.next(),sc.nextInt()));
					break;
			case 2:
					System.out.println("the summary of the top employee is \n");
					e=s.pop();
					System.out.println(e);					
					break;
			case 3: 
					b=true;
					break;
		}
	}
}
}
					
					
	
				
				
	