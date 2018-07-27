/**
 * 
 * So in main we've got some example code that runs a
 * calculation.  But we want to run 2 calculations at 
 * the same time.  Use threads to make it possible to
 * do this.  I recommend you create an inner
 * class that implements runnable in this class.  This
 * inner class should take the name of the job
 * as a parameter to it's constructor.
 * 
 * If you do this right you should see something like:
 *
 * Starting Job 1
 * Starting Job 2
 * Finishing Job 1
 * Finishing Job 2
 * 
 * although the order that the jobs finish isn't fixed - 
 * job 2 could finish first.
 * 
 * When you finish, go on to the next file for part 2.
 *
 * @author hewner.
 *         Created Nov 7, 2016.
 */
public class Part1Solution {

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
		MyRunner job1 = new MyRunner("Job 1");
		MyRunner job2 = new MyRunner("Job 2");
		
		Thread t1 = new Thread(job1);
		Thread t2 = new Thread(job2);
		t1.start();
		t2.start();
	}
	
	public static void main(String[] args) {
		// not doing the work in main to make it easier
		// to use inner classes
		Part1Solution p = new Part1Solution();
		p.runCalculations();

	}

}
