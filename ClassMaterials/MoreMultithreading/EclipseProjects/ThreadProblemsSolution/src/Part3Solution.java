/**
 * On big intense calculations, there are a limited
 * number of jobs that can be run at the same time.  
 * For example, if our system has 3 cores and each
 * calculation uses 50% of the cores, we can only run
 * 6 calculations and get the benefit of threading.  
 * So even if we had 100 jobs that could be run in 
 * parallel, starting more than 6 threads would be 
 * counterproductive.
 * 
 * The existing code runs calculations in parallel 
 * correctly, but it runs ALL jobs at the same time.
 * 
 * What we want is to only run a number of jobs equal
 * to MAX_THREADS.  THEN, when those jobs complete,
 * start other jobs, until all the jobs are done.
 * 
 * If you do this correct, you should see something like 
 * this for MAX_THREADS=2 and 6 jobs
 * 
 * Starting Job 1
 * Starting Job 2
 * Finishing Job 1
 * Finishing Job 2
 * Starting Job 3
 * Starting Job 4
 * Finishing Job 3
 * Finishing Job 4
 * Starting Job 5
 * Starting Job 6
 * Finishing Job 5
 * Finishing Job 6
 * 
 * Here are 2 approaches to this:
 * 
 * 1.  Keep a list of unstarted jobs. Then when a calculation
 * finishes, the thread looks at the list of jobs and 
 * finds another to start.
 * 2.  Have Runnable objects set a field when they complete.
 * Then in the main thread, loop across the threads and when
 * one completes find another to start.
 * 
 * @author hewner.
 *         Created Nov 7, 2016.
 */
public class Part3Solution {

	public static final int MAX_THREADS = 3;
	
	public class MyRunner implements Runnable {
		private String jobName;
		boolean finished;
		
		MyRunner(String jobName) {
			this.jobName = jobName;
			finished = false;
		}
		@Override
		public void run() {
			Calculation.doCalculation(this.jobName);
			finished = true;
		}
		
		public boolean isFinished() {
			return finished;
		}
	}
	
	public void runCalculations() {
		int totalJobs = 10;
		MyRunner[] jobs = new MyRunner[totalJobs];
		for(int i = 0; i < totalJobs; i++) {
			jobs[i] = new MyRunner("Job " + (i+1));
		}
		int nextJob = 0;
		while(true) {
			int finishedJobs = 0;
			if(nextJob == totalJobs)
				break;
			for(int i = 0; i < totalJobs; i++) {
				if(jobs[i].isFinished()) finishedJobs++;
			}
			
			if(nextJob - finishedJobs < MAX_THREADS) {
				Thread t = new Thread(jobs[nextJob]);
				t.start();
				nextJob++;
			}
		}

	}
	
	public static void main(String[] args) {
		// not doing the work in main to make it easier
		// to use inner classes
		Part3Solution p = new Part3Solution();
		p.runCalculations();

	}


	
}
