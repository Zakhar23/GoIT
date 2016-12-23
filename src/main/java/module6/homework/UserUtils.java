package module6.homework;

import java.util.Arrays;

public class UserUtils {
    static public User[] uniqueUsers(User[] users) {
        User[] unic = new User[1];
        unic[0] = users[0];

        for (int i = 1; i < users.length; i++) {
            boolean equals = false;

            for (User user : unic) {
                if (user.equals(users[i])) {
                    equals = true;
                }
            }

            if (!equals) {
                unic = Arrays.copyOf(unic, unic.length + 1);
                unic[unic.length - 1] = users[1];
            }

        }
        return unic;
    }

    static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] unic = new User[0];
        for (User user : users) {
            if (user.balance == balance) {
                unic = Arrays.copyOf(unic, unic.length + 1);
                unic[unic.length - 1] = user;
            }
        }
        return unic;
    }

    static User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            user.balance = user.balance + user.salary;
        }
        return users;
    }

    static long[] getUsersId(User[] users) {
        long[] id = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            id[i] = users[i].id;
        }
        return id;
    }

    /*static User[] deleteEmptyUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].id == 0)
        }
    }*/
}
