package Pkg1;

public abstract class AbsMyClass1 {

	int d;
	private int a;
	
	
	public AbsMyClass1() {
		// TODO Auto-generated constructor stub
		
		System.out.println("in my claas1 def constr");
	}
	
	public AbsMyClass1(int a)
	{
		this.a=a;
	}
	
	
	private void show()
	{
	System.out.println("hello");
	}
	
	public void greet()
	{
		System.out.println("greet from m y side");
	}
	
	abstract void absmethod();
	
	
}
