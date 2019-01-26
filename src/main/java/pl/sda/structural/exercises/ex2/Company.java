package pl.sda.structural.exercises.ex2;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private final List<Employee> employees = new ArrayList<Employee>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void printTotalEmployeeCount() {
        int i = employees.size();
        for (Employee employee : employees) {
            i += employee.getEmployeeCount();
        }
        System.out.println("Total employee count = " + i);
    }
}
