package Pkg1;

public class tester {
	
	
	public static void main(String[] args)
	{
		MyClass1 ob2=new MyClass2();
		//AbsMyClass1 ref=ob2;
		ob2.greet();
		ob2.greet1();
		ob2=new  MyClass1();
		MyClass2 m2=new  MyClass2();
		m2.greet();
		m2.greet1();
	}

	
}
