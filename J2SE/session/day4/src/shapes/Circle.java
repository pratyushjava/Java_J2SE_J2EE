package shapes;

import intf.Compute;

public  class Circle extends Point implements Compute{
	private double rad;

	public Circle(int x, int y, double rad) {
		super(x, y);
		this.rad = rad;
	}

	@Override
	public String toString() {
		return "Circle "+super.toString() +" [rad=" + rad + "]";
	}
	@Override
	public double calcArea()
	{
		return PI*rad*rad;
	}
	
	@Override
	public double calcPerimeter()
	{
		return 2*PI*rad;
	}
	

}
