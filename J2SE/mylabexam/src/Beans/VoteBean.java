package Beans;

public class VoteBean {
	
	
	private int congress;
	private int bjp;
	private int mns;
	
	
	public VoteBean() {
		System.out.println("in def constr of vote bean");
		congress=0;
		bjp=0;
		mns=0;
	}
	public int getCongress() {
		return congress;
	}
	public void setCongress(int congress) {
		this.congress = congress+1;
		System.out.println("congress"+this.congress);
	}
	public int getBjp() {
		return bjp;
	}
	public void setBjp(int bjp) {
		this.bjp = bjp+1;
		System.out.println("bjp"+this.bjp);
	}
	public int getMns() {
		return mns;
	}
	public void setMns(int mns) {
		this.mns = mns+1;
		System.out.println("mns"+this.mns);
	}
	
	public double getPerc()
	{
		double per=(congress*100)/(congress+mns+bjp);
		return per;
	}
	public double getPerb()
	{
		double per=(bjp*100)/(congress+mns+bjp);
		return per;
	}
	public double getPerm()
	{
		double per=(mns*100)/(congress+mns+bjp);
		return per;
	}
	
	
	

}
