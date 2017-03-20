//class below IS NOT a Thrd , it is simply a runnable task 
package thrds3;

public class NewThrd implements Runnable {
	private Thread t;

	public NewThrd(String nm) {
		t = new Thread(this, nm);// new
		t.start();//rdy
	}

	@Override
	public void run() {
		System.out.println("thrd started " + t.getName());
		boolean flag = true;
		int i = 0;
		try {
			while (flag) {

				System.out.println("in thrd " + t.getName() + " #" + i++);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println("exc in thrd " + t.getName() + "  " + e);
		}

		System.out.println("thrd over " + t.getName());

	}

	public Thread getT() {
		return t;
	}
	

}
