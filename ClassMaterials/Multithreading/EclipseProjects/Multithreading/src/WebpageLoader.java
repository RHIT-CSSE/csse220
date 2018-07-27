import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class WebpageLoader {

	/*
	 * This method loads a webpage at a particular URL.
	 * 
	 * You should not need to modify this method
	 */
	public void loadWebpage() {
		try {
			URL url = new URL("http://www.hewner.com/cgi-bin/SlowPage.cgi");
			System.out.println("loading webpage");
			long startTime = System.currentTimeMillis();
			InputStream foo = url.openStream();
			int numCharacters = 0;
			while (foo.read() != -1) {
				numCharacters++;
			}
			long endTime = System.currentTimeMillis();
			double seconds = ((double) endTime - startTime) / 1000;
			System.out.printf("loaded %d characters in %.5f seconds\n",
					numCharacters, seconds);
		} catch (IOException e) {
			System.err.println("An error occured");
		}
	}

	/*
	 * Loads a webpage 10 times, one after the other
	 * 
	 * You should not need to modify this method
	 */
	public void doSerialTest() {
		for(int i=0; i < 10; i++) {
			loadWebpage();
		}
	}

	/*
	 * Loads a webpage 10 times in paralell using threads
	 */
	public void doParalellTest() {
		//TODO: Write this method to use java threads
	}
	
	public static void main(String[] args) {
		
		WebpageLoader test = new WebpageLoader();
		System.out.println("Doing serial test...\n");
		test.doSerialTest();
		
		System.out.println("\nDoing paralell test...(10 pages at the same time)\n");
		test.doParalellTest();

	}

}
