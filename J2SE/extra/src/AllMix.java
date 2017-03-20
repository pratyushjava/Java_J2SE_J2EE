import java.util.Scanner;
class AllMix
{
	public static void main(String [] args)
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number of rows ");
	//int [] rows = new int[sc.nextInt()]; 
	int row = sc.nextInt();
	System.out.println("enter the number of columns ");
	//int [] cols = new int[sc.nextInt()]; 
	int col = sc.nextInt();
	int i,j;
	int [][] am = new int[row][col];
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			System.out.print(am[i][j]+" ");
		}
		System.out.println();
	}
	/*int [][] am ={{53,14,8,45},{4,15,7,21},{5,7,6,63}} ;
	for(int i=0;i<=am.length;i++)
	{
		for(int j=0;j<=am.length;j++)
		{
			System.out.print(am[i][j]+" ");
		}
		System.out.println();
	}*/
	}
}
