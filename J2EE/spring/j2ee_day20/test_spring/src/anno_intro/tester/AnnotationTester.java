package anno_intro.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import anno_intro.beans.Customer;

public class AnnotationTester {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring_anno.xml");

		Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);
	}
}