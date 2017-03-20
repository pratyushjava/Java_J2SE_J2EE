package thrds1;

public class NewThrd extends Thread {
	public NewThrd(String name) {
		super(name);// New thrd
		start();// rdy
	}

	@Override
	public void run() {
		System.out.println("thrd started " + getName());
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("in thrd " + getName() + " #" + i);
				if (getName().equalsIgnoreCase("two"))
					System.in.read();
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println("exc in thrd " + getName() + "  " + e);
		}
		System.out.println("thrd over " + getName());

	}

}
