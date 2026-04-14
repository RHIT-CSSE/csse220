package hourTrackerB;

import java.time.Duration;
import java.time.LocalDateTime;

public class Employee {
  String employeeId;
  String name;
  String socialSecurityNum;
  //Only can store one start and end date/times
  String startDateAndTime;
  String stopDateAndTime;

  public String createPayReport() {
  if (startDateAndTime == null || stopDateAndTime == null) {
    return "Pay report for " + employeeId + ": 0.0 hours";
  }
  LocalDateTime start = LocalDateTime.parse(startDateAndTime);
  LocalDateTime stop = LocalDateTime.parse(stopDateAndTime);
  long minutes = Duration.between(start, stop).toMinutes();
  double hours = minutes > 0 ? minutes / 60.0 : 0.0;
  return "Pay report for " + employeeId + ": " + hours + " hours";
}
}
