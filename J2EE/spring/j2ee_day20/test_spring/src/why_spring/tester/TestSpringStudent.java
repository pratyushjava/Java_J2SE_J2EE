package why_spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import why_spring.beans.*;
public class TestSpringStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-intro.xml");
		SpringStudent s1=(SpringStudent)ctx.getBean("stud1");
		s1.setFirstName("new_fname");
		s1.setLastName("new_lname");
		
	
	}

}
