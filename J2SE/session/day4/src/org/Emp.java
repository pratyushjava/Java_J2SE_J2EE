package org;

public abstract class Emp {
	private int id;
	private String name;
	private double basic;
	public Emp(int id, String name, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", basic=" + basic + "]";
	}
	public abstract double computeNetSal();
	/*{
		return -1;
	}*/
	public double getBasic() {
		return basic;
	}
	
	

}
