package spel.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spel.model.collections.*;

public class TesterCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ApplicationContext ctx
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"resources/spel_collection.xml");
		Customer c1 = (Customer) ctx.getBean("customerBean2");
		System.out.println(c1);
		
		((ClassPathXmlApplicationContext)ctx).registerShutdownHook();
	
	}

}
