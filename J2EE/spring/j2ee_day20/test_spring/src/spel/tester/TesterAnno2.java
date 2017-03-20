package spel.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spel.model.anno2.*;

public class TesterAnno2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ApplicationContext ctx
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"resources/spel_anno_config1.xml");
		Customer c1 = (Customer) ctx.getBean("customerBean");
		System.out.println(c1);
		
		((ClassPathXmlApplicationContext)ctx).registerShutdownHook();
	}

}
