package module8.homework;

import module7.homework.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(3424L, "Oleg");
        User user2 = new User(1024L, "Petka");

        AbstractDAO<User> abstractDAO = new UserDAO<>();

        abstractDAO.save(user1);
        abstractDAO.save(user2);
        System.out.println(abstractDAO.getList());

    }
}
