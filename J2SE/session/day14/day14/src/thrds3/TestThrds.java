package thrds3;

public class TestThrds {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// display dtls of main thrd
		Thread t=Thread.currentThread();
		System.out.println(t);//name,prio,tg
		t.setName("newMain");
		System.out.println(t);
		//create child thrds --- to test concurrency
		NewThrd t1=new NewThrd("one");
		NewThrd t2=new NewThrd("two");
		
		NewThrd t3=new NewThrd("three");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("in thrd " + t.getName() + " #" + i);
			Thread.sleep(1000);
		}
		System.out.println("main waiting for child thrds to finish exec");
		t1.getT().join(1000);
		t2.getT().join(2000);
		t3.getT().join(2000);
		
		System.out.println(t2.getT().isAlive()?"Alive":"Dead");
		//main forcing child thrd's exec to finish
		t1.getT().interrupt();
		t2.getT().interrupt();
		t3.getT().interrupt();
		
		System.out.println("confirming thrd sts");
		System.out.println(t2.getT().isAlive()?"Alive":"Dead");
		t1.getT().join();
		t2.getT().join();
		t3.getT().join();
		
		System.out.println("main over....");

	}

}
