package employeeSalaryA;

public class Employee {
    public String name;
    public String managerName;
    public boolean isManager;
    public double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}