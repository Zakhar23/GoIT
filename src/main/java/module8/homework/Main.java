package module8.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(3424L, "Oleg");
        User user2 = new User(1024L, "Petka");
        User user3 = new User(2227L, "Vasia");

        AbstractDAO<User> abstractDAO = new UserDAO();

        abstractDAO.save(user1);
        abstractDAO.save(user2);
        abstractDAO.save(user3);
        System.out.println(abstractDAO.getList());

//        abstractDAO.delete(user2);
//        System.out.println(abstractDAO.getList());

        List<User> newList = new ArrayList<>();
        newList.add(user1);

        abstractDAO.deleteAll(newList);
        System.out.println(abstractDAO.getList());

        abstractDAO.saveAll(newList);
        System.out.println(abstractDAO.getList());

        abstractDAO.deleteById(2227L);
        System.out.println(abstractDAO.getList());

        System.out.println(abstractDAO.get(1024L));
    }
}
