package wrappers;

public class TestWrapper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i1=100;//auto-boxing
		int data=++i1;//auto-unboxing,inc,assgn
		System.out.println(i1+" "+data);
		String i2=new String("nani");//boxing
		//ring dat=i2.StringValue();//un-boxing
		System.out.println(i2);
		
	}

}
