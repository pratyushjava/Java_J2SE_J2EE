package tester;
import inh.*;
class TestInh 
{
	public static void main(String[] args) 
	{
		//create super class obj;
		A a1=new A(100);//super-class ref referring to super-cls obj
		B b1=new B(10,20);//sub-class ref ---> sub class obj.
		a1.show();//direct ref --super cls
		b1.show();//direct ref ---sub cls ver
		//up-casting
		A ref;//super-cls ref 
		ref=b1;//up-casting---automatic
		ref.show();
		((B)ref).test();//explicit down-casting is required to satisfy compiler.
	}
}
