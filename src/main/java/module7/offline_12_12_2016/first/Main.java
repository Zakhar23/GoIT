package module7.offline_12_12_2016.first;

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
                int compare = (o1.secondName + o1.name).compareTo(o1.secondName + o1.name);
                return compare;
            }
        });

        List<User> users21 = new ArrayList<>();

        for (int j = 0; j < users.size(); j++) {
            if (users.get(j).age > 21) {
                users21.add(users.get(j));
            }
        }

        //users.stream().filter()

        System.out.println(users.size());
        System.out.println(users21.size());
    }
}
