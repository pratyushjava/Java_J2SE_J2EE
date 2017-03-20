class Matrix
{
private int rows;
private int column;
private int a[][]=new int[3][3];

Matrix()
{
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		a[i][j]=1;
	}
}
}
Matrix(int i,int j)
{
	this();
	rows=i;
	rows=j;
}
void setElement(int r,int c,int v)
{
	if((v>0) && (r<3) && (c<3))
	{
		a[r][c]=v;
	}
	else
	{
		a[r][c]=0;
	}
}
void transpose()
{
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a[i].length;j++)
	{
		int temp;
		temp=a[i][j];
		a[i][j]=a[j][i];
		a[j][i]=temp;
	}
}
}
void show()
{
	for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		System.out.print(a[i][j]+"");
	}
	System.out.println();
}
}
public static void main(String a[])
{
Matrix n=new Matrix(3,3);
n.setElement(0,0,1);
n.setElement(0,1,2);
n.setElement(0,2,3);
n.setElement(1,0,4);
n.setElement(1,1,5);
n.setElement(1,2,6);
n.setElement(2,0,7);
n.setElement(2,1,8);
n.setElement(2,2,9);

n.show();
System.out.println();
System.out.println();
System.out.println();
n.transpose();
n.show();
}
}

		