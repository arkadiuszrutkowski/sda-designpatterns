package pl.sda.structural.exercises.ex2;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private final List<Employee> employees = new ArrayList<Employee>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int getEmployeeCount() {
        int i = employees.size();
        for (Employee employee : employees) {
            i += employee.getEmployeeCount();
        }
        return i;
    }
}
