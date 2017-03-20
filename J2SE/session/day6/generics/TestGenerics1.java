package generics;

public class TestGenerics1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create NonGeneric1 class inst --- holding int data
		/*NonGenerics1 n1=new NonGenerics1(100);//int--->Integer--->Object
		//display F.Q cls names
		n1.showDetails();
		int data=(Integer)n1.getRef();//auto-unboxing
		// create NonGeneric1 class inst --- holding string data
		NonGenerics1 n2=new NonGenerics1("hello");//up-casting (String--->Object)
		n2.showDetails();
		//get string
		String s=(String) n2.getRef();
		n1=n2;//gust to fool compiler but class cast exception as  integer and string are at same level so widening is not allowed
		//data=(Integer) n1.getRef();*/
		// create Generic1 class inst --- holding int data
		Generics1<Integer> g1=new Generics1<Integer>(1234);//auto-boxing
		g1.showDetails();
		//get int data
		int data=g1.getRef();//auto-un-boxing
		//create Generic1 class inst --- holding string data
		Generics1<String> g2=new Generics1<String>("abc");
		g2.showDetails();
		String ss=g2.getRef();
		//g1=g2;un-comment this to understand in-compatibility.now it will give error at compile time
	}

}
