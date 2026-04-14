package hourTrackerB;

import java.util.ArrayList;
import java.util.List;

public class HourTrackerMain {
  List<Employee> employees = new ArrayList<>();

  public void handleStartWork(String employeeId, String startDateAndTime) {
    Employee e = findOrCreate(employeeId);
    e.startDateAndTime = startDateAndTime;
    e.stopDateAndTime = null;
  }

  public void handleStopWork(String employeeId, String stopDateAndTime) {
    Employee e = findOrCreate(employeeId);
    e.stopDateAndTime = stopDateAndTime;
  }

  public void handlePrintPayReport(String employeeId) {
    Employee e = findOrCreate(employeeId);
    System.out.println(e.createPayReport());
  }

  private Employee findOrCreate(String employeeId) {
    for (Employee e : employees) {
      if (employeeId != null && employeeId.equals(e.employeeId)) {
        return e;
      }
    }
    Employee e = new Employee();
    e.employeeId = employeeId;
    employees.add(e);
    return e;
  }

    public static void main(String[] args) {
        //Disign is nonfunctional as multiple times cannot be stored
        HourTrackerMain app = new HourTrackerMain();

        app.handleStartWork("e1", "2026-01-12T09:00");
        app.handleStopWork("e1", "2026-01-12T17:00");

        // overwrites previous times
        app.handleStartWork("e1", "2026-01-13T09:00");
        app.handleStopWork("e1", "2026-01-13T12:00");
        app.handlePrintPayReport("e1");
    }
}
