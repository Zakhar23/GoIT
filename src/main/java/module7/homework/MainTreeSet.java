package module7.homework;

import module4.homework.first.Currency;

import java.util.*;

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
        User user9 = new User(1234L, "Rick", "Petrov", "Kiev", 50000);
        User user10 = new User(1234L, "Rick", "Russ", "Kiev", 50000);

        TreeSet<Order> orders = new TreeSet<>();
        orders.add(new Order(56789, 250, Currency.USD, "lux", "qwe", user1));
        orders.add(new Order(56789, 100, Currency.USD, "standart", "qwe", user2));
        orders.add(new Order(56789, 150, Currency.USD, "lux", "qwe", user3));
        orders.add(new Order(56789, 230, Currency.USD, "norm", "qwe", user4));
        orders.add(new Order(16789, 300, Currency.USD, "standart", "qwe", user5));
        orders.add(new Order(16789, 200, Currency.USD, "king", "qwe", user6));
        orders.add(new Order(16789, 190, Currency.EUR, "lux", "qwe", user7));
        orders.add(new Order(16789, 205, Currency.EUR, "lux", "qwe", user8));
        orders.add(new Order(16789, 510, Currency.EUR, "king", "qwe", user9));
        orders.add(new Order(16789, 510, Currency.EUR, "king", "qwe", user9));

        System.out.println(orders.first());

        boolean itContaine = false;
        for (Order elem : orders) {
            if (elem.getUser().getLastName().equals("Petrov")) {
                itContaine = true;
            }
        }
        System.out.println(itContaine);

        List<Order> toDel = new ArrayList<>();
        for (Order order : orders) {
            if (order.getCurrency() == Currency.USD) {
                toDel.add(order);
            }
        }
        orders.removeAll(toDel);

        orders.forEach(System.out::println);

    }


}
