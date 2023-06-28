package hw3;

public class Manager extends Employee {
    public Manager(String lastName, String firstName, int salary) {
        super(lastName, firstName, salary);
    }
    public static void increaseSalary(Employee[] employees, int amount) {
        for (Employee employee : employees
        ) {
            if (!(employee instanceof Manager)) {
                employee.increaseSalary(amount);
            }
        }
    }
}
