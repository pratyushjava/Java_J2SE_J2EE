package test_synch;

public class Tester {

	
	public static void main(String[] args) {
		 final Utils u1 = new Utils();
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				while (true)
					u1.test();
			}
		};
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				while (true) {
						u1.test();
					
				}

			}
		};
		new Thread(r1).start();
		new Thread(r2).start();

	}

}