
import java.util.*;

class TestPrimArrayScanner 
{
	public static void main(String[] args) 
	{
		//create sc inst
		Scanner sc=new Scanner(System.in);
		//accept size of array
		System.out.println("How many Doubles u want to store?");
		//create array
		double[] myData=new double[sc.nextInt()];
		//confirm array data 
		System.out.println("orig array before init ");
		for(int i=0;i<myData.length;i++)
			System.out.print(myData[i]+"  ");
		System.out.println();
		//accept data & disp the same
		for (int i=0;i<myData.length ;i++ )
		{
			System.out.println("Enter Data");
			myData[i]=sc.nextDouble();
		}
		System.out.println("array post init");
		for(int i=0;i<myData.length;i++)
			System.out.print(myData[i]+"  ");
		//alternative to for --- for-each
		//read only loop --suitable for disp purposes.
		System.out.println();
		for(double d : myData) {
			d=100;
			System.out.print(d+"  ");

		}
		System.out.println("array after init in for - each");
		for(double d : myData) {
			
			System.out.print(d+"  ");

		}
		//one more alternative to disp array contents via Arrays class API

		System.out.println("\n Array cont via Arrays class "+Arrays.toString(myData));
		//dynamic init of array
		double[] newData={23.467,1.2,5.89,23,234};
		System.out.println("\n Array cont via Arrays class "+Arrays.toString(newData));
		


		
	}
}
