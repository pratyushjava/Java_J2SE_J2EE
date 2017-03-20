package why_spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import why_spring.beans.*;
public class TestSpringStudent1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-intro1.xml");
		SpringStudent s1=(SpringStudent)ctx.getBean("stud1");
		s1.setFirstName("new_name");

		s1=(SpringStudent)ctx.getBean("stud2");
		s1.setFirstName("new_name1");
		
		s1=(SpringStudent)ctx.getBean("stud3");
		s1.setFirstName("new_name2");
		
		s1=(SpringStudent)ctx.getBean("stud4");
		s1.setFirstName("new_name3");
	}

}
