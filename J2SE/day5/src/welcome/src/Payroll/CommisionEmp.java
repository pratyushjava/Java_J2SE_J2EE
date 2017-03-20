package Payroll;

public class CommisionEmp extends Employee {
	
	double grosssales;
	double commrate;
	double netsal;
	
	public CommisionEmp(int id, String name, String addr, int deptid,
			double basicsal, double grosssales, double commrate) {
		super(id, name, addr, deptid, basicsal);
		this.grosssales = grosssales;
		this.commrate = commrate;
	}

	public double netsalary()
	{
		netsal=grosssales*commrate;
		return netsal;
	}

}
