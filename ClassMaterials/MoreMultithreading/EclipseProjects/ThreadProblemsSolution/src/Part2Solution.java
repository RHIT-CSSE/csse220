/**
 * Let's imagine a more complication situation 
 * where once again, like part 1, we have multiple calculations
 * that should run in parallel. However, 
 * now a calculation the requires 4 steps.
 * Step 1 must be finished before steps 2A & 2B start.
 * Step 2A & 2B can be run in parallel. Step 3 can only start 
 * after both Steps 2A & 2B finish.
 *
 * Solution? 
 * Threads that while running, thread other threads to do 
 * part of the work!
 * 
 * You'll probably want to reuse your inner class
 * from Part 1, but you'll also need a new inner
 * class for this one.
 * 
 * If you do this correctly, running a single job
 * should look like this:
 * 
 * Starting Buffalo job Step 1
 * Finishing Buffalo job Step 1
 * Starting Buffalo job Step 2A
 * Starting Buffalo job Step 2B
 * Finishing Buffalo job Step 2A
 * Finishing Buffalo job Step 2B
 * Starting Buffalo job Step 3
 * Starting Buffalo job Step 3
 * 
 * Running 2 jobs should look something like this:
 * 
 * Starting Job 2 Part 1
 * Starting Job 1 Part 1
 * Finishing Job 2 Part 1
 * Finishing Job 1 Part 1
 * Starting Job 2 Part 2A
 * Starting Job 2 Part 2B
 * Starting Job 1 Part 2A
 * Starting Job 1 Part 2B
 * Finishing Job 1 Part 2B
 * Finishing Job 2 Part 2A
 * Finishing Job 1 Part 2A
 * Finishing Job 2 Part 2B
 * Starting Job 1 Part 3
 * Starting Job 2 Part 3
 * Finishing Job 2 Part 3
 * Finishing Job 1 Part 3
 * 
 * @author hewner.
 *         Created Nov 7, 2016.
 */
public class Part2Solution {
	
	public class ThreeStepRunner implements Runnable {
		private String jobName;
		ThreeStepRunner(String jobName) {
			this.jobName = jobName;
		}
		@Override
		public void run() {
			Calculation.doCalculation(this.jobName + " Part 1");
			Thread t1 = new Thread (new MyRunner(this.jobName + " Part 2A"));
			Thread t2 = new Thread (new MyRunner(this.jobName + " Part 2B"));
			t1.start();
			t2.start();
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Calculation.doCalculation(this.jobName + " Part 3");
		}
	}

	public class MyRunner implements Runnable {
		private String jobName;
		MyRunner(String jobName) {
			this.jobName = jobName;
		}
		@Override
		public void run() {
			Calculation.doCalculation(this.jobName);
		}
	}

	
	public void runCalculations() {
		Runnable job1 = new ThreeStepRunner("Job 1");
		Runnable job2 = new ThreeStepRunner("Job 2");
		
		Thread t1 = new Thread(job1);
		Thread t2 = new Thread(job2);
		t1.start();
		t2.start();
	}
	
	public static void main(String[] args) {
		// not doing the work in main to make it easier
		// to use inner classes
		Part2Solution p = new Part2Solution();
		p.runCalculations();

	}

}
