package employeeSalaryA;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<Employee> employees = new ArrayList<>();

    public void handleUpdateEmployeeSalary(String name, double salary) {
        for (Employee e : employees) {
            if (e.name.equals(name)) {
                e.setSalary(salary);
                return;
            }
        }
    }

    public double handleGetSalary(String name) {
        for (Employee e : employees) {
            if (e.name.equals(name)) {
                return e.getSalary();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Main app = new Main();
        Employee e1 = new Employee(); e1.name = "Alice"; e1.managerName = "Bob"; e1.isManager = false; e1.salary = 50000;
        Employee e2 = new Employee(); e2.name = "Bob"; e2.managerName = ""; e2.isManager = true; e2.salary = 80000;
        app.employees.add(e1);
        app.employees.add(e2);
        app.handleUpdateEmployeeSalary("Alice", 55000);
        System.out.println("Alice salary: " + app.handleGetSalary("Alice"));
        System.out.println("Bob salary: " + app.handleGetSalary("Bob"));
    }
}