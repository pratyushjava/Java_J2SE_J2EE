package spel.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spel.model.newname.*;

public class TesterAnno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ApplicationContext ctx
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"resources/spel_anno_config.xml");
	/*	DataBean b1=(DataBean) ctx.getBean("dataBean1");
		DataBean b2=(DataBean) ctx.getBean("dataBean1");*/
		System.out.println("before getting cust");
		Customer c1 = (Customer) ctx.getBean("cust");
		System.out.println(c1);
		//either form invokes destroy-method
	//	((ClassPathXmlApplicationContext)ctx).close();// required for auto-invocation of destroy methods of
					// singleton beans. close() doesn't exist with ApplicationContext.
		
		((ClassPathXmlApplicationContext)ctx).registerShutdownHook();
	}

}
