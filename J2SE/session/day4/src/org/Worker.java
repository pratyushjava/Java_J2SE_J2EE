package org;

public class Worker extends Emp {
	private int hours;
	private double rate;

	public Worker(int id, String name, double basic, int hours, double rate) {
		super(id, name, basic);
		this.hours = hours;
		this.rate = rate;
	}

	// disp mgr state
	@Override
	public String toString() {
		return "Worker " + super.toString() + " Hours " + hours + " Rate "
				+ rate;
	}
	//net sal=basic + (hrs*rate)
	@Override
	public double computeNetSal() {
		// TODO Auto-generated method stub
		return getBasic()+(hours*rate);
	}

	public double getRate() {
		return rate;
	}
	
	

}
