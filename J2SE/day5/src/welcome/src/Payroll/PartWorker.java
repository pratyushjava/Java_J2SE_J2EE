package Payroll;

public class PartWorker extends Employee {
	int partsmade;
	double rateperpart;
	double netsal;
	
	
	public PartWorker(int id, String name, String addr, int deptid,
			double basicsal, int partsmade, double rateperpart) {
		super(id, name, addr, deptid, basicsal);
		this.partsmade = partsmade;
		this.rateperpart = rateperpart;
	}


	public double netsalary()
	{
		netsal=basicsal+(partsmade+rateperpart);
		return netsal;
	}

}
 