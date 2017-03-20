package spel.model.anno2;

import java.util.Scanner;

import org.springframework.stereotype.Component;

//if u dont specify name --- defualts to java style var name eg --- dataBean
@Component("dataBean2")
public class DataBean {

	private Scanner sc;
	
	public DataBean() {
		sc=new Scanner(System.in);
	}
	public void init()
	{
		System.out.println("in init2");
	}
	public void close()
	{
		System.out.println("in destroy2");
	}
	public int getPostalCode()
	{
		System.out.println("Enter Zip Code");
		return sc.nextInt();
	}
	public String getName()
	{
		System.out.println("Enter Customer Name");
		return sc.next();
	}
	
	public String RetrieveStreet()
	{
		System.out.println("Enter Street Name");
		return sc.next();
	}
	
	public String getCountry()
	{
		System.out.println("Enter Country Code");
		return sc.next();
	}
	
}
