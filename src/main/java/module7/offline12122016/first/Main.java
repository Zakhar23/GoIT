package module7.offline12122016.first;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            users.add(new User("User" + i, "secondname" + i, i));
        }
        //System.out.println(users);

        users.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return (o1.secondName + o1.name).compareTo(o2.secondName + o2.name);
            }
        });

        List<User> users21 = new ArrayList<>();

        for (User user : users) {
            if (user.age > 21) {
                users21.add(user);
            }
        }


        //users.stream().filter()

        System.out.println(users.size());
        System.out.println(users21.size());

        System.out.println(System.currentTimeMillis());
    }
}
