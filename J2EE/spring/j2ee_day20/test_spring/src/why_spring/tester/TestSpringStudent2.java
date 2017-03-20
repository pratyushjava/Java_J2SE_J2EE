package why_spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import why_spring.beans.SpringStudent2;;
public class TestSpringStudent2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-intro2.xml");
		SpringStudent2 s1=(SpringStudent2)ctx.getBean("stud5");
		System.out.println(s1);
		s1.setFirstName("Rama123");

	
	}

}
