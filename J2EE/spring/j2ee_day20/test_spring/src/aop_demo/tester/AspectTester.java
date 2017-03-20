package aop_demo.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_demo.domain.CustomerIntf;

public class AspectTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/simple_config.xml");
		CustomerIntf cust=(CustomerIntf) ctx.getBean("customer");
		cust.addCustomer();
		cust.addCustomerRetValue();

	}

}
