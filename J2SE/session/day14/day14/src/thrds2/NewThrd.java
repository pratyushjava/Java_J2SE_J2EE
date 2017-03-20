package thrds2;

public class NewThrd extends Thread {
	public NewThrd(String name) {
		super(name);// New thrd
		start();// rdy
	}

	@Override
	public void run() {
		System.out.println("thrd started " + getName());
		boolean flag = true;
		int i = 0;
		while (flag) {
			try {

				System.out.println("in thrd " + getName() + " #" + i++);
				Thread.sleep(500);

			} catch (Exception e) {
				System.out.println("exc in thrd " + getName() + "  " + e);
			}
		}
		System.out.println("thrd over " + getName());

	}

}
