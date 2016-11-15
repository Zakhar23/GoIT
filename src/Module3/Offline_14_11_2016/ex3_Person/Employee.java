package Module3.Offline_14_11_2016.ex3_Person;

public class Employee extends Person {
    private String address;
    private int salary;

    public Employee(String gender, String name, int age, String secondName, String address, int salary) {
        super(gender, name, age, secondName);
        this.address = address;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
