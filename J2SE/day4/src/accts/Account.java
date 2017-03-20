package accts;
public class Account
{
private int accno;
private String name;
private String type;
private int bal;
public Account(int accno,String name,String type,int bal)
{
this.accno=accno;
this.name=name;
this.type=type;
this.bal=bal;
}
public String toString()
{
	return ("accno="+accno+"name="+name+"type="+type+"balance="+bal);
}
public void withdrawal(int amt)
{
bal-=amt;
}
public void deposit(int amt)
{
bal+=amt;
}
public int getAccno()
{
	return accno;
}
}
