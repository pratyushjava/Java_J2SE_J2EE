package aop_demo.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_demo.domain.CustomerIntf;

public class AspectTester1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/simple_config.xml");
		CustomerIntf cust=(CustomerIntf) ctx.getBean("customer");
		
		try {
			cust.addCustomerWithExc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("from main "+e);
		}
		

	}

}
