/*
1. Create Java application for the Cell phone charges bill: Accept the user’s plan and no. of calls made in a month as cmd line args. 
(eg : 1,2,3 Fixed charges for these plans are 200,250,300) 
In the 1st step keep metering of the calls as constant. 
Calls between 0-100 free.
 Calls between  101-300 amount per call 0.80 
Calls  between 301-450 1Rs 
and higher no : 1.5 
Using the formula Net charges = fixed charges +(no of calls*amount) , compute & display the bill.*/


class PhoneBill
{
int plan;
double variablecost;
int noofcall;
double net_charges;

PhoneBill(int plan,int noofcall)
{
this.plan =plan;
this.noofcall=noofcall;
}

double variable_cost()
{
if(noofcall<=100)
{
variablecost=0;
}
else if(noofcall<=300)
{
variablecost=(noofcall*0.80);
}
else if(noofcall<=450)
{
variablecost=(noofcall*1);
}
else
{
variablecost=(noofcall*1.5);
}
return variablecost;
}

double net_charge()
{
switch(plan)
{
case 1:
		net_charges=200+variable_cost();
		return net_charges;
	
case 2:
		net_charges=250+variable_cost();
		return net_charges;
	

case  3:
		net_charges=300+variable_cost();
		return net_charges;

}
return 0;
}
void display()
{
System.out.println("the net charges for your bill is "+net_charge());
}
}
		