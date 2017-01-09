package module6.homework;

import java.util.Arrays;

final class UserUtils {
    static User[] uniqueUsers(User[] users) {
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
        int count = 0;
        for (User user : users) {
            if (user.getBalance() == balance) {
                count++;
            }
        }

        User[] unic = new User[count];
        int index = 0;
        for (User user : users) {
            if (user.getBalance() == balance) {
                unic[index] = user;
                index++;
            }
        }
        return unic;
    }

    static User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            user.setBalance(user.getBalance() + user.getSalary());
        }
        return users;
    }

    static long[] getUsersId(User[] users) {
        long[] id = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            id[i] = users[i].getId();
        }
        return id;
    }

    static User[] deleteEmptyUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == 0) {
                for (int j = i; j < users.length; j++) {
                    if ((j + 1) >= users.length) {
                        break;
                    }
                    users[j] = users[j + 1];
                }
                users = Arrays.copyOfRange(users, 0, users.length - 1);
            }
        }
        return users;
    }
}
