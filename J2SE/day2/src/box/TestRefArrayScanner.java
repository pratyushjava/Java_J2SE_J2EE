package box;
import java.util.*;

class TestRefArrayScanner 
{
	public static void main(String[] args) 
	{
		//create sc
		Scanner sc=new Scanner(System.in);
		//accept no of boxes & create 
		//suitable array of Box type of refs.
		System.out.println("How many Boxes ");
		Box[] myBoxes=new Box[sc.nextInt()];
		
		for (Box b : myBoxes)
		{
			System.out.println(b);
		}
		//create Boxes by taking user i/p
		for(int i=0;i<myBoxes.length;i++){
			System.out.println("Enter Box dims");
			myBoxes[i]=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		/*for(Box b2 : myBoxes)
		{
			System.out.println("Enter Box dims");
			b2=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}*/
		//disp box dims from for-each loop
		for (Box b1:myBoxes)
		{
			b1.displayDims();
		}

		//dyn init of box[]
		System.out.println("dyn init array data ");
		Box[] newBoxes={new Box(1,2,3),new Box(2,3,4),new Box(10,20,30)};
		for (Box b : newBoxes)
		{
			b.displayDims();
		}

		System.out.println("main over....");
	}
}
