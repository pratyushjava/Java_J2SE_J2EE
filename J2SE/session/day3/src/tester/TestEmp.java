package tester;
import org.*;
class TestEmp 
{
	public static void main(String[] args) 
	{
		//create emp obj & disp the state using toString
		Emp e1=new Emp(101,"aa",1000);
		System.out.println(e1);//direct ref Emp ref referring to emp obj.
		//in-direct ref.
		Object ref;
		ref=e1;
		System.out.println(ref);
	}
}
