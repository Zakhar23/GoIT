package module7.offline12122016.first;

public class User implements Comparable<User> {
    String name;
    String secondName;
    int age;

    public User(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    @Override
    public int compareTo(User oo) {
        return age - oo.age;
    }
}
