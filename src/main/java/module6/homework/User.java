package module6.homework;

public class User {
    long id;
    String firstName;
    String lastName;
    int salary;
    int balance;

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (!(ob instanceof User)) return false;

        User user = (User) ob;

        return (this.id == user.id) && (this.firstName.equals(user.firstName))
                && (this.lastName.equals(user.lastName)) && (this.salary == user.salary)
                && (this.balance == user.balance);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + salary;
        result = 31 * result + balance;
        return result;
    }
}
