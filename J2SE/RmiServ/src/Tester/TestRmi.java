package Tester;

import java.io.File;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

import CalImp.calImp;

public class TestRmi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		calImp c;
		try {
			c = new  calImp();
			File f1=new File("./bin/");
			String cb=f1.getAbsoluteFile().toURI().toURL().toString();
			System.setProperty("java.rmi.server.codebase", cb);
			Naming.bind("rmi://localhost:1099/mycal", c);
			System.out.println("remote object registerd");
		} catch (RemoteException | MalformedURLException | AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
