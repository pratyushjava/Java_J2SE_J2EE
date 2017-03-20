package tester;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import beans_anno.*;
import config.SpringBeansConfig;

public class TestHelloBeanAnno {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringBeansConfig.class);
		HelloBeanIntf ref=(HelloBeanIntf) ctx.getBean("hello1");
		ref.printDetails();

	}

}
