package tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import simple.Person;
import simple.PersonIntf;

public class TestSimple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/simple_config.xml");
		PersonIntf p=(PersonIntf) ctx.getBean("person");
		System.out.println(p.getName());
	}

}
