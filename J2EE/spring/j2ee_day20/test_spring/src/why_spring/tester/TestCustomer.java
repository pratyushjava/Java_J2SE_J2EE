package why_spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import why_spring.beans.Customer;
public class TestCustomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-intro2.xml");
		Customer c1=(Customer)ctx.getBean("cust1");
		System.out.println(c1);
		
		c1=(Customer)ctx.getBean("cust2");
		System.out.println("By Type \n"+c1);
		
		c1=(Customer)ctx.getBean("cust3");
		System.out.println("By Index \n"+c1);
	
	}

}
