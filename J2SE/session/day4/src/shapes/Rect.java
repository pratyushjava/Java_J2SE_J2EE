package shapes;

import intf.Compute;

public class Rect extends Point implements Compute {
	private double w,h;
	
	public Rect(int x, int y, double w, double h) {
		super(x, y);
		this.w = w;
		this.h = h;
	}
	
	@Override
	public String toString() {
		return "Rect "+super.toString() +"[w=" + w + ", h=" + h + "]";
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return w*h;
	}

	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return 2*(w+h);
	}

}
