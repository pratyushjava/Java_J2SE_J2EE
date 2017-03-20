package no_itc;
public class Utils2 {
	private Emp e;
	private boolean dataReady;
	
	

	public synchronized void writeData(Emp ref) throws Exception {
		 System.out.println("w entered --- "+Thread.currentThread().getName());
		while(dataReady)
			wait();
		//produce data
		e = ref;
	//	Thread.sleep(30);
		System.out.println("Write Data " +e);
		dataReady=true;
	
		 System.out.println("w exited --- "+Thread.currentThread().getName());
		notify();
		
	}

	public synchronized Emp readData() throws Exception {
		 System.out.println("r entered --- "+Thread.currentThread().getName());
		while(!dataReady)
			wait();
		//consume data
		System.out.println("Read  Data " + e);
		 System.out.println("r exited --- "+Thread.currentThread().getName());
		
	
		dataReady=false;
		notify();
		return e;
	}

}
