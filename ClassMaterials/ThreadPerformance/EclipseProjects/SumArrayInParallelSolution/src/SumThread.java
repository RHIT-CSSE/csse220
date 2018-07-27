//TODO 4A SumThread class goes here step 4(A)
public class SumThread implements Runnable {

	private long sum;
	private int[] data;
	private int start;
	private int stop;
	
	public SumThread(int[] data, int start, int stop) {
		this.data = data;
		this.start = start;
		this.stop = stop;
		this.sum = 0;
	}
	
	@Override
	public void run() {
		for (int i=start; i < stop;i++) {
			this.sum += data[i];
		}
	}
	
	public long getSum() {
		return sum;
	}

	
	
}
