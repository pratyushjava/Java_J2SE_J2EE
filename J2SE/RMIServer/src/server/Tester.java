package server;
import java.io.File;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
public class Tester 
{

	
	public static void main(String[] args) 
	{
		String codeBaseURL;
					try
						{
							
							ServiceImple si=new ServiceImple();
							codeBaseURL=new File("./bin/").getAbsoluteFile().toURI().toURL().toString();
							System.setProperty("java.rmi.server.codebase",codeBaseURL);
							Naming.rebind("rmi://127.0.0.1:1099/MyCalc", si);
							System.out.println("server started");
						} 
					catch (RemoteException e)
						{
							e.printStackTrace();
						} 
					catch (MalformedURLException e) 
						{
							e.printStackTrace();
						}
	}

}
