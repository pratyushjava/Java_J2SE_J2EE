package geom;
import java.util.*;
class TestPointArray
{
	public static void main(String a[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of points you want to enter");
	Point2D [] pd;
	pd=new Point2D[sc.nextInt()];
	System.out.println("enter values of x and y for each object of point2d array");
	for(int i=0;i<pd.length;i++)
	{
		pd[i]=new Point2D(sc.nextInt(),sc.nextInt());
	}
	for(Point2D p:pd)
	{
	System.out.println(p.show());
	System.out.println("isEqual methord returns"+p.isEqual(p));
	}
	}
}
	
	
	