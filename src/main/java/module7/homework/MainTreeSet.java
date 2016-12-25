package module7.homework;

import module4.homework.first.Currency;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        User user1 = new User(1234L, "Rick", "Russ", "BKiev", 50000);
        User user2 = new User(1234L, "Rick", "Russ", "Kiev", 50000);
        User user3 = new User(1234L, "Rick", "Russ", "Kiev", 50000);
        User user4 = new User(1234L, "Rick", "Russ", "AKiev", 50000);
        User user5 = new User(1234L, "Rick", "Russ", "Kiev", 50000);
        User user6 = new User(1234L, "Rick", "Russ", "CKiev", 50000);
        User user7 = new User(1234L, "Rick", "Russ", "Kiev", 50000);
        User user8 = new User(1234L, "Rick", "Russ", "AAKiev", 50000);
        User user9 = new User(1234L, "Rick", "Russ", "Kiev", 50000);
        User user10 = new User(1234L, "Rick", "Russ", "Kiev", 50000);

        TreeSet<Order> orders = new TreeSet<>();
        orders.add(new Order(56789, 200,Currency.USD, "lux", "qwe",user1));
        orders.add(new Order(56789, 100, Currency.USD, "standart", "qwe", user2));
        orders.add(new Order(56789, 150, Currency.USD, "lux", "qwe", user3));
        orders.add(new Order(56789, 200, Currency.USD, "norm", "qwe", user4));
        orders.add(new Order(16789, 300, Currency.USD, "standart", "qwe", user5));
        orders.add(new Order(16789, 200, Currency.USD, "king", "qwe", user6));
        orders.add(new Order(16789, 190, Currency.USD, "lux", "qwe", user7));
        orders.add(new Order(16789, 205, Currency.USD, "lux", "qwe", user8));
        orders.add(new Order(16789, 510, Currency.USD, "king", "qwe", user9));
        orders.add(new Order(16789, 400, Currency.USD, "norm", "qwe", user10));



    }
}
