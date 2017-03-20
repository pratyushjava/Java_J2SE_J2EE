package why_spring.tester;
import why_spring.beans.*;
public class TestStudent1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student1 s1=new Student1("aa","bb");
		System.out.println("student created");
		s1.setId(101);
		

	}

}
