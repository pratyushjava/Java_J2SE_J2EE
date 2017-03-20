package performService.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import performService.Performer;

public class TestPerformance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("performance.xml");
		Performer p1=(Performer) ctx.getBean("sJuggler");
		p1.perform();
		System.out.println("#######################");
		p1=(Performer) ctx.getBean("sMagician");
		p1.perform();
		System.out.println("#######################");
	}

}
