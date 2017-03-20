package org;
import stack.*;
public class Fixed implements StackEmp
{
Emp []a;
Emp e;
int top;
Fixed(int l)
{
a=new Emp[l];
top =-1;
}
public void push(Emp e)
{
a[++top]=e;
}
public Emp pop()
{
	e=a[top];
	a[top]=null;
	top--;
	return e;
}
}


	