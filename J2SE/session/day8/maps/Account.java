package maps;

public class Account implements Comparable<Account>{
	private int id;
	private String name,type;
	private double bal;
	public Account(int id, String name, String type, double bal) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "Account ***********[id=" + id + ", name=" + name + ", type=" + type
				+ ", bal=" + bal + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public void withdraw(double amt)
	{
		bal -= amt;
	}
	public void deposit(double amt)
	{
		bal += amt;
	}
	@Override
	public int compareTo(Account o) {
		// sort as per a/c bal
		System.out.println("in compare to");
		return (int)(bal-o.bal); 
				//bal > o.bal ? 1 : (bal == o.bal) ? 0 : -1;
	}
	

}
