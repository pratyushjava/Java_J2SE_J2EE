package org;
import stack.*;
class Growable implements StackEmp
{
Emp a1[];
Emp a2[];
Emp e;
int flag;
int top;
Growable()
{
flag=0;
top=-1;
a1=new Emp[top+2];
}
public void push(Emp e)
{
if(flag==0)
{
a1[++top]=e;
flag++;
}
else
{
a2=new Emp[a1.length];
for(int i=0;i<a1.length;i++)
{
a2[i]=a1[i];
}
a1=new Emp[a1.length+1];
for(int i=0;i<a2.length;i++)
{
a1[i]=a2[i];
}
a1[++top]=e;
flag++;
}
a2=null;
}

public Emp pop()
{
	
	
	e=a1[top];
	a1[top--]=null;
	
	a2=new Emp[a1.length-1];
	flag--;
	
	for(int i=0;i<a1.length-1;i++)
	{
	a2[i]=a1[i];
	}
	
	if(flag>1)
	{
	a1=new Emp[a1.length-1];
	}
	
	for(int i=0;i<a2.length;i++)
	{
	a1[i]=a2[i];
	}
	a2=null;
	return e;
	
}
}