package tester;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.HelloBeanIntf;

public class TestHelloBean {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloBeanIntf ref=(HelloBeanIntf) ctx.getBean("hello");
		ref.printDetails();

	}

}
