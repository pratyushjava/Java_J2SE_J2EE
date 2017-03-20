package box;
class Box 
{
	//D.M 
	private double w,d,h;
	//constr -- paramed
	Box(double w1,double d1,double h)
	{
		w=w1;
		d=d1;
		this.h=h;
	}
	//B.L --- display Dims
	void displayDims()
	{
		System.out.println("Box dims "+w+" "+d+"  "+h);
	}
	//compute vol
	double calcVolume()
	{
		return w*d*h;
	}
}
