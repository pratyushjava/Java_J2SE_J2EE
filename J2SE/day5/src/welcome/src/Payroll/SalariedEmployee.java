package Payroll;

public class SalariedEmployee extends Employee {
	
	double hra;
	double da;
	double netsal;
	

	public SalariedEmployee(int id, String name, String addr, int deptid,
			double basicsal, double hra, double da) {
		super(id, name, addr, deptid, basicsal);
		this.hra = hra;
		this.da = da;
	}


	public double netsalary()
	{
		netsal=basicsal + hra + da *(0.20);
		return netsal;
	}
	
}
