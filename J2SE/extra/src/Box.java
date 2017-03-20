class Box
{
int l,b,h,v;
Box(int l,int b,int h)
{
this.l=l;
this.b=b;
this.h=h;
}
void calculate()
{
v=l*b*h;
}
void display()
{
System.out.println("the volume of box is ="+v);
} 
}