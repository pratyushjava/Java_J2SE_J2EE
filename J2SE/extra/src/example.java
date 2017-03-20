class A
{
static int a=1;
}
class B
{
B()
{
System.out.println("value of a in classA is="+A.a);
System.out.println();
System.out.println();
System.out.println();
System.out.println();
}
void display()
{
	System.out.println("this fun is called");
}
public static void main(String s[])
{
B b=new B();
b.display();
}
}
