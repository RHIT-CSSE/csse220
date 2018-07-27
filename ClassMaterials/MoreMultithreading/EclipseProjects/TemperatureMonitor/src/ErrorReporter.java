import java.util.List;

public class ErrorReporter implements Runnable {

	private List<MonitorError> errors;

	public ErrorReporter(List<MonitorError> errors) {
		this.errors = errors;
	}

	@Override
	public void run() {
		while (true) {
			if (errors.size() > 0) {
				System.out.println(errors.get(0));
				errors.remove(0);
			}
		}

	}

}
