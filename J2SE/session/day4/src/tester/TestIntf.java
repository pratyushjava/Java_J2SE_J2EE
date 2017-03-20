package tester;

import intf.Compute;
import shapes.Circle;
import shapes.Rect;

public class TestIntf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create circle & rect inst
		Circle c1 = new Circle(10, 20, 10.56);
		Rect r1 = new Rect(30, 50, 34.56, 10.34);
		// use direct ref to disp state & chk B.L
		System.out.println(c1 + " Area " + c1.calcArea() + " Peri "
				+ c1.calcPerimeter());
		System.out.println(r1 + " Area " + r1.calcArea() + " Peri "
				+ r1.calcPerimeter());
		//Dyn method dispatch --- using i/f ref.
		//interface ref
		Compute ref;
		ref=c1;
		System.out.println(ref + " Area " + ref.calcArea() + " Peri "
				+ ref.calcPerimeter());
		ref=r1;
		System.out.println(ref + " Area " + ref.calcArea() + " Peri "
				+ ref.calcPerimeter());
		
	}

}
