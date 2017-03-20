package spel.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spel.model.Customer;



public class Tester {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	ApplicationContext ctx
	ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/spel_config.xml");
	Customer c1=(Customer)ctx.getBean("cust1");
	System.out.println(c1);
	
	
	

	}

}
