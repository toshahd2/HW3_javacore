package hw3;

public class Employee {
    private String lastName;
    private String firstName;
    private int salary;

    public Employee(String lastName, String firstName, int salary){
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFisrtName() {
        return firstName;
    }

    public int getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        salary += amount;
    }

    @Override
    public String toString(){
        return String.format("Фамилия: %s Имя: %s Зарплата: %d", lastName, firstName, salary);
    }
}
