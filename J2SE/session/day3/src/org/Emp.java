package org;
public class Emp 
{
	//D.M
	private int id;
	private String name;
	private double basic;
	public Emp(int i,String nm,double b)
	{
		id=i;
		name=nm;
		basic=b;
	}
	//ret string representation of emp state
	//by using toString()
	@Override
	public String toString()
	{
		return id+" "+name+"  "+basic;
	}
	public double computeNetSal()
	{
		return -1;
	}

}
