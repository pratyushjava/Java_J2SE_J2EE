package thrds2;

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
		t1.join(1000);
		t2.join(2000);
		t3.join(2000);
		
		System.out.println(t2.isAlive()?"Alive":"Dead");
		//main forcing child thrd's exec to finish
		t1.interrupt();
		t2.interrupt();
		t3.interrupt();
		
		System.out.println("confirming thrd sts");
		System.out.println(t2.isAlive()?"Alive":"Dead");
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("main over....");

	}

}
