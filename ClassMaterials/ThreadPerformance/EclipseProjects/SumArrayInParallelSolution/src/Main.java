/**
 * This class runs the SumArrayInParallel application.
 * 
 * @author wilkin. Updated by defoe on Nov 9, 2015 
 *
 */
public class Main {

	public static int[] dataToSum;
	
	public static void main(String[] args) {
		int n = 200000000;
		int numThreads = 4;
		long startTime = System.currentTimeMillis();
		//TODO 3 set data will need numThreads as a second argument Step 3
		setData(n);
		long endTime = System.currentTimeMillis();
		
		System.out.println("Done creating array, took " + 
		                    (endTime-startTime)  + " ms");
		System.out.flush();
		
		
		startTime = System.currentTimeMillis();
		long c = sumSerial(dataToSum);
		endTime = System.currentTimeMillis();
		
		System.out.println("Done summing array serially, took "+ 
                (endTime-startTime) + " ms");
		System.out.flush();
		

		//TODO 4F call sumParallel here, step 4(F)
		startTime = System.currentTimeMillis();
		long d = sumParallel(dataToSum, numThreads);
		endTime = System.currentTimeMillis();
		
		System.out.println("Done summing array parallel, took "+ 
                (endTime-startTime) + " ms");
		System.out.flush();
		
		
	}
	
	public static void setData(int n) {
		dataToSum = new int[n];
		for(int i = 0; i < n; i++) {
			double randSign = Math.random();
			double randVal = Math.random();
			int sign = (randSign < 0.5) ? -1 : 1;
			dataToSum[i] = (int)(randVal * n) * sign;
		}
	}
	public static long sumSerial(int[] data) {
		long result = 0;
		for(int i = 0; i < data.length; i++)
			result += data[i];
		return result;
	}
	

	//TODO 4E method sumParallel(...) goes here, steps 4(E) and 6
	//TODO 6
	public static long sumParallel(int[] data, int numThreads) {
		int size = data.length;
		int divider = size / numThreads;
		SumThread[] sumThreads = new SumThread[numThreads];
		Thread[] threads = new Thread[numThreads];
		for (int i=0;i<numThreads;i++) {
			int start = i * divider;
			int stop = (i+1) * divider;
			sumThreads[i] = new SumThread(data, start, stop);
			threads[i] = new Thread(sumThreads[i]);
			threads[i].start();
		}
		
		long sum = 0;
		for (int i=0;i< numThreads;i++) {
			try {
				threads[i].join();
				sum += sumThreads[i].getSum();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sum;
	}
	
}
