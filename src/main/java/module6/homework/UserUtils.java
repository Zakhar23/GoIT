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

    //users are equal when all their field are equal
    static User[] usersWithContitionalBalance(User[] users, int balance) {
        return new User[0];
    }

    //user’s balance == balance
    public User[] paySalaryToUsers(User[] users) {
        return new User[0];
    }

    static long[] getUsersId(User[] users) {
        return new long[0];
    }

    static User[] deleteEmptyUsers(User[] users) {
        return new User[0];
    }
}
