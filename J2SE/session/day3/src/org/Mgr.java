package org;
public class Mgr extends Emp 
{
	//D.M
	private double perfBonus;
	public Mgr(int i,String nm,double b,double bonus)
	{
		super(i,nm,b);
		perfBonus=bonus;
	}
	//B.L --- ret state of mgr -- by @Overrride toString 
	@Override
	public String toString()
	{
		return "Mgr "+ super.toString() +" Bonus "+perfBonus;
	}
}
