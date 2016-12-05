package main.java.Module3.Offline_14_11_2016.ex3_Person;

public class Main {
    public static void main(String[] args) {
        int sumOfSalary = 0;
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("m", "Sam", 20, "Samovich", "Kiev", 150);
        employees[1] = new Employee("m", "Sam", 20, "Samovich", "Kiev", 200);
        employees[2] = new Employee("m", "Sam", 20, "Samovich", "Kiev", 20);
        employees[3] = new Employee("m", "Sam", 20, "Samovich", "Kiev", 32);
        employees[4] = new Employee("m", "Sam", 20, "Samovich", "Kiev", 500);
        employees[5] = new Employee("m", "Sam", 20, "Samovich", "Kiev", 200);
        employees[6] = new Employee("m", "Sam", 20, "Samovich", "Kiev", 852);
        employees[7] = new Employee("m", "Sam", 20, "Samovich", "Kiev", 321);
        employees[8] = new Employee("m", "Sam", 20, "Samovich", "Kiev", 57);
        employees[9] = new Employee("m", "Sam", 20, "Samovich", "Kiev", 544);

        for (Employee item : employees) {
            sumOfSalary += item.getSalary();
        }

        System.out.println(sumOfSalary);
    }
}
