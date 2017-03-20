package CalImp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import CalIf.Calc;

public class calImp extends UnicastRemoteObject implements Calc {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public calImp() throws RemoteException {
		System.out.println("in def constr of remote serv calc");
	}
	@Override
	public int Add(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a+b;
	}

}
