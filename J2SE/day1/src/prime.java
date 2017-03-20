class Prime 
{
int n;
int i;
Prime(int num)
{
n=num;
i=2;
}
void checkPrime()
{
if(n>=100 && n<=300)
{
while(i<n)
{
if(n%i==0)
{
System.out.println(i);
System.out.println("not a prime number");
break;
}
else
i++;
}
if(i==n)
{
System.out.println("this is a prime number ");
}
}
else
System.out.println("number is out of range");
}

public static void main(String a[])
{
Prime p=new Prime(Integer.parseInt(a[0]));
p.checkPrime();
}
}