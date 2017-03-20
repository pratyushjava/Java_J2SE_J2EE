//write emp records in buffered manner on text file
package helper;
import java.io.*;

import model.Emp;

public class UtilsFile {
	private PrintWriter pw;
	public UtilsFile() throws Exception{
		pw=new PrintWriter(new FileWriter("emp_info.txt"),true);
	}
	public  void writeData(Emp e) throws Exception
	{
		pw.print("{ "+e.getId());
		Thread.sleep(500);
		pw.print(" "+e.getName());
		Thread.sleep(700);
		pw.print(" "+e.getDeptId());
		Thread.sleep(100);
		pw.print(" "+e.getSal());
		Thread.sleep(1000);
		pw.println(" } ");
	}
	public void close()
	{
		if (pw != null)
			pw.close();
	}

}
