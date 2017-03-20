package tester;

import emp_impl.EmpUtilsImpl;
import java.io.*;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.JOptionPane;

public class EmpSrvrAppln {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// rem obj
			EmpUtilsImpl e1 = new EmpUtilsImpl();
			// set codebase
			File f1 = new File("./bin/");
			String url = f1.getAbsoluteFile().toURI().toURL().toString();
			System.setProperty("java.rmi.server.codebase", url);
			Naming.rebind("rmi://localhost:1099/Emp_utils", e1);
			System.out.println("remote obj registered");
			JOptionPane.showConfirmDialog(null, "Quit RMI Server");
			Naming.unbind(e1);
			UnicastRemoteObject.unexportObject(e1,false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
