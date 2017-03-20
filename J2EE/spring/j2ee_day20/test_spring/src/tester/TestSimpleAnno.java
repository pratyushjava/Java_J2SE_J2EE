package tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import simple.PersonIntf;
import config.SpringBeansConfig;

public class TestSimpleAnno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringBeansConfig.class);
		PersonIntf p=(PersonIntf) ctx.getBean("person");
		System.out.println(p.getName());
	}

}
