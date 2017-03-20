package why_spring.tester;
import why_spring.beans.*;
public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1=new Student("aa","bb");
		System.out.println("student created");
		s1.setId(101);
		

	}

}
