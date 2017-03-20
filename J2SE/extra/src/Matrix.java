class Matrix
{
	
		int rows;
		int cols;
		int [][] mat= new int[4][4];
		public Matrix()
		{
			for(int i=0;i<mat.length;i++)
			{
				for(int j=0;j<mat.length;j++)
				{
					mat[i][j]=0;
				}
			}
		}
		
		public Matrix(int rows, int cols)
		{
			this();
			this.rows=rows;
			this.cols=rows;
		}
		
		void setElement(int r, int c, int value)
		{
			if((value>0) && (r<4) && (c<4))
			{
				mat[r][c]=value;
			}
			else
			{
				mat[r][c]=0;
			}
		}
			
		void show()
		{
			for(int i=0;i<mat.length;i++)
			{
				for(int j=0;j<mat[i].length;j++)
				{
					System.out.print(mat[i][j]+"");
				}
				System.out.println();
			}
		}
		
		
	public static void main(String[] args)
	{
		Matrix n=new Matrix(4,4);
		n.setElement(0,0,1);
		n.setElement(0,1,2);
		n.setElement(0,2,3);
		n.show();
	}
}




/*import java.lang.*;
class Matrix
{
	public static void main(String[] args)
	{
		scanner sc=new scanner(System.in);
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int [][] Matrix= new int[rows][cols];
		public Matrix()
		{
			System.out.print(Matrix[][]);
		}
	}
}*/
		
		
		
	