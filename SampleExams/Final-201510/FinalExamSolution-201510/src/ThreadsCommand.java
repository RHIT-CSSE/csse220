import java.util.ArrayList;
import java.util.Scanner;


public class ThreadsCommand {

	
	public static class CommandThread implements Runnable {

		int threadNumber;
		boolean shouldStop;
		
		public CommandThread(int number) {
			this.threadNumber = number;
			this.shouldStop = false;
		}
		
		public void stop() {
			this.shouldStop = true;
		}
		
		@Override
		public void run() {
			while(!shouldStop) {
				try {
					System.out.println("Thread " + this.threadNumber + " checking in every 5 seconds");
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					break;
				}
			}
			System.out.println("Thread " + this.threadNumber + " stopping gracefully");
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to ThreadCommand.  Enter your commands.\n");
		ArrayList<CommandThread> threadsToStop = new ArrayList<CommandThread>();
		int currentThreadNum = 1;
		while(true) {
			
			String currentCommand = input.next();
			if(currentCommand.equals("create")) {
				System.out.println("This command should create a new thread");

				CommandThread newThread = new CommandThread(currentThreadNum);
				threadsToStop.add(newThread);
				(new Thread(newThread)).start();
				currentThreadNum++;
			}
			if(currentCommand.equals("stopall")) {
				System.out.println("This command should exit all currently existing threads gracefully.");
				for(CommandThread t : threadsToStop) {
					t.stop();
				}
			}
			if(currentCommand.equals("exit")) {
				// this thread ends the whole program
				// you don't need to change the operation 
				// of this function
				
				System.exit(0);
			}
		}
		

	}

}
