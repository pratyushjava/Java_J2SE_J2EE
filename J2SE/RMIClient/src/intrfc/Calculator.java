package intrfc;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote
{
	 int add(int a,int b) throws RemoteException; 
	 int sub(int a,int b ) throws RemoteException;
	 int mul( int a,int b) throws RemoteException;
	 int dev(int a,int b ) throws RemoteException;
}
