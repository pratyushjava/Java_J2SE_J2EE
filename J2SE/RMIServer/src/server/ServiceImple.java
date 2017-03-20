package server;

import intrfc.Calculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceImple  extends UnicastRemoteObject implements Calculator
{
	private static final long serialVersionUID = 1L;
	protected ServiceImple () throws RemoteException
	{
		super();
	}
	@Override
	public int add(int a,int b)  
	{
		return a+b;

	}
	@Override
	public int mul(int a,int b) {

		return a*b;
	}
	@Override
	public int dev(int a,int b) {

		return a/b;
	}
	@Override
	public int sub(int a,int b) {

		if(a>b)
			return a-b;
		return b-a;
	}
}
