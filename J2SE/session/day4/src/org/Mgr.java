package org;

public class Mgr extends Emp 
{
	//d.m
	private double perfBonus;

	public Mgr(int id, String name, double basic, double perfBonus) {
		super(id, name, basic);
		this.perfBonus = perfBonus;
	}
	//disp mgr state
	@Override
	public String toString()
	{
		return "Mgr "+super.toString()+" Bonus "+perfBonus;
	}
	//net sal=basic+bonus
	@Override
	public double computeNetSal()
	{
		return getBasic()+perfBonus;
	}
	public double getPerfBonus() {
		return perfBonus;
	}
	
	

}
