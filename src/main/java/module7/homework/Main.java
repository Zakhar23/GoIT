package module7.homework;

import module4.homework.first.Currency;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1234L, "Rick", "Russ", "BKiev", 50000);
        User user2 = new User(1234L, "Rick", "Russ", "Kiev", 50000);
        User user3 = new User(1234L, "Rick", "Russ", "Kiev", 50000);
        User user4 = new User(1234L, "Rick", "Russ", "AKiev", 50000);
        User user5 = new User(1234L, "Rick", "Russ", "Kiev", 50000);
        User user6 = new User(1234L, "Rick", "Russ", "CKiev", 50000);
        User user7 = new User(1234L, "Rick", "Russ", "Kiev", 50000);
        User user8 = new User(1234L, "Rick", "Russ", "Kiev", 50000);
        User user9 = new User(1234L, "Rick", "Russ", "Kiev", 50000);
        User user10 = new User(1234L, "Rick", "Russ", "Kiev", 50000);

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(56789L, 200, Currency.USD, "lux", "qwe", user1));
        orders.add(new Order(56789L, 100, Currency.USD, "lux", "qwe", user2));
        orders.add(new Order(56789L, 150, Currency.USD, "lux", "qwe", user3));
        orders.add(new Order(56789L, 200, Currency.USD, "lux", "qwe", user4));
        orders.add(new Order(56789L, 300, Currency.USD, "lux", "qwe", user5));
        orders.add(new Order(56789L, 200, Currency.USD, "lux", "qwe", user6));
        orders.add(new Order(56789L, 190, Currency.USD, "lux", "qwe", user7));
        orders.add(new Order(56789L, 205, Currency.USD, "lux", "qwe", user8));
        orders.add(new Order(56789L, 510, Currency.USD, "lux", "qwe", user9));
        orders.add(new Order(56789L, 400, Currency.USD, "lux", "qwe", user10));

        //за убыванием
        orders.sort(Order::compareTo);

        int k = 1;

        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order order1, Order order2) {
                if (order1.price == order2.price) {
                    return order1.user.getCity().compareTo(order2.user.getCity());
                }
                return order1.price - order2.price;
            }
        });

        k = 11;

    }
}
