package beans_anno;

public class HelloBean implements HelloBeanIntf{
	private String name;
	private int age;
	private double amt;
	public HelloBean()
	{
		System.out.println("in constr Hello bean");
	}
	public HelloBean(String name, int age) {
		System.out.println("in param constr Hello bean");
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	@Override
	public void printDetails()
	{
		System.out.println("Details- "+name+" "+age+" "+amt);
	}
	
	

}
