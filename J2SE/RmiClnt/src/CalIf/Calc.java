package CalIf;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calc extends Remote {
	
	
	public int Add(int a,int b) throws RemoteException;

}
