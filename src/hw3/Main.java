package hw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Manager("Егоров", "Антон", 250000));
        employees.add(new Employee("Иванов", "Иван", 120000));
        employees.add(new Employee("Попов", "Игорь", 100000));


        System.out.println("Сотрудники:");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }

        Manager.increaseSalary(employees.toArray(new Employee[0]), 5000);
        System.out.println("\nПовышение зарплат:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}