package hourTrackerA;

public class HourTrackerMain {
  java.util.List<WorkLog> workLogs = new java.util.ArrayList<>();

  public void handleStartWork(String employeeId, String startDateAndTime) {
    WorkLog w = new WorkLog();
    w.employeeId = employeeId;
    w.startDateAndTime = startDateAndTime;
    workLogs.add(w);
  }

  public void handleStopWork(String employeeId, String stopDateAndTime) {
      // Convoluted approach to updating employee's work log that has been started but not stopped

    for (int i = workLogs.size() - 1; i >= 0; i--) {
      WorkLog w = workLogs.get(i);
      if (employeeId.equals(w.employeeId) && w.stopDateAndTime == null) {
        w.stopDateAndTime = stopDateAndTime;
        break;
      }
    }
  }

  public void handlePrintPayReport(String employeeId) {
    double totalHours = 0.0;
    for (WorkLog w : workLogs) {
      if (!employeeId.equals(w.employeeId)) {
        continue;
      }
      // Skip incomplete logs (started but not stopped yet)
      if (w.startDateAndTime == null || w.stopDateAndTime == null) {
        continue;
      }
      java.time.LocalDateTime start = java.time.LocalDateTime.parse(w.startDateAndTime);
      java.time.LocalDateTime stop = java.time.LocalDateTime.parse(w.stopDateAndTime);
      long minutes = java.time.Duration.between(start, stop).toMinutes();
      if (minutes > 0) {
        totalHours += minutes / 60.0;
      }
    }
    System.out.println("Pay report for " + employeeId + ": " + totalHours + " hours");

  }

  public static void main(String[] args) {
    //Employee is not a class
    HourTrackerMain app = new HourTrackerMain();
    app.handleStartWork("e1", "2025-10-31T09:00");
    app.handleStopWork("e1", "2025-10-31T17:00");
    app.handlePrintPayReport("e1");
    app.handleStartWork("e2", "2025-10-31T10:00");
    app.handlePrintPayReport("e2");
  }
}