package inh;

public class B extends A
{
	//D.M
	private int j;
	//constr ---to init complete state of B
	public B(int i,int j1)
	{
		//super()
		super(i);//super-cls costr inits state of super cllas
		j=j1;
	}
	//modify behaviour of show to disp entire state of B
	//method overriding--- same meth name,same signature, ret type can be same or its sub-type,scope -- of the overridden method can be same or wider.
	public void show()
	{
		super.show();
		System.out.println("in sub class "+j);
	}
	//add new method---sub-class only
	public void test()
	{
		System.out.println("sub-class only method");
	}
	
}
