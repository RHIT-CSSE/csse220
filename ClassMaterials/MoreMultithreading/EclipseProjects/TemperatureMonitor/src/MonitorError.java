
public class MonitorError {

	public static final int TEMPERATURE_ERROR = 0;
	public static final int HUMIDITY_ERROR = 1;
	private int errorType;
	private String labName;
	private boolean aboveRange;
	
	public MonitorError(String labName, int errorType, boolean aboveRange) {
		this.errorType = errorType;
		this.labName = labName;
		this.aboveRange = aboveRange;
	}
	
	public int getErrorType() {
		return this.errorType;
	}
	
	@Override
	public String toString() {
		return String.format("Lab: %s is showing an error for %s %s its range.",
				this.labName, 
				this.errorType == HUMIDITY_ERROR ? "Humidity" : "Temperature",
				this.aboveRange ? "above" : "below");
	}
	
}
