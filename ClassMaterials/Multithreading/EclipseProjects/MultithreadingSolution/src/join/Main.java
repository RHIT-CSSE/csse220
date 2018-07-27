package join;

/**
 * Tests the join method.
 * 
 * @author boutell. Created Sep 30, 2010.
 */
public class Main {
	/**
	 * Starts here.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		class MyRunnable implements Runnable {
			private String name;
			private int goal;

			public MyRunnable(String name, int goal) {
				this.name = name;
				this.goal = goal;
			}

			@Override
			public void run() {
				for (int i = 0; i < goal; i++) {
					System.out.printf("%s counts %d\n", this.name, (i + 1));
				}
			}
		}

		Thread t1 = new Thread(new MyRunnable("Jerry", 3));
		t1.start();
		Thread t2 = new Thread(new MyRunnable("Margaret", 6));
		t2.start();
		// try {
		// // Try without joining, with t1 and t2.join, and t1.join only.
		//			
		// } catch (InterruptedException exception) {
		// // ignore
		// }

		System.out.println("Done!");
	}

}
