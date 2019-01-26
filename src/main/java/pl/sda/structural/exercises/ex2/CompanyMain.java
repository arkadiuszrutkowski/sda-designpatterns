package pl.sda.structural.exercises.ex2;

public class CompanyMain {

    public static void main(String[] args) {
        Company company = new Company();
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();

        Manager manager1 = new Manager();
        manager1.addEmployee(worker1);
        manager1.addEmployee(worker2);
        manager1.addEmployee(worker3);

        Manager manager2 = new Manager();
        manager2.addEmployee(new Worker());
        manager2.addEmployee(new Worker());
        manager2.addEmployee(manager1);

        company.add(manager2);
        company.printTotalEmployeeCount();
    }
}
