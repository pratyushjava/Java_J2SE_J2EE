package spel.model.newname;

import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//if u dont specify name --- defaults to java style var name eg --- dataBean
@Component("dataBean1")
@Scope(value="singleton")

public class DataBean {

	private Scanner sc;
	
	public DataBean() {
		System.out.println("in data bean1 constr");
		sc=new Scanner(System.in);
	}
	@PostConstruct
	public void init()
	{
		System.out.println("in init");
	}
	@PreDestroy
	public void close()
	{
		System.out.println("in destroy");
	}
	public int getQuantity()
	{
		System.out.println("Enter Quantity");
		return sc.nextInt();
	}
	public String getName()
	{
		System.out.println("Enter Item Name");
		return sc.next();
	}
	
}
