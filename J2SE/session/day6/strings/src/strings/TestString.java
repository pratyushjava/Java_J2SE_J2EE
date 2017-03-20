package strings;

public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String(s1);
		String s4="Hello";
		System.out.println("s1==s2"+(s1==s2));
		System.out.println("s1==s3"+(s1==s3));
		System.out.println("s1.equals(s2)"+(s1.equals(s2)));
		System.out.println("s1.equals(s3)"+(s1.equals(s3)));
		System.out.println("s1.equals(s4)"+s1.equals(s4));
		System.out.println("s1.equalsIgnoreCase(s4)"+s1.equalsIgnoreCase(s4));
		s3=s3.concat("HI");
		s3 += "abcd";
		System.out.println(s3);
	}

}
