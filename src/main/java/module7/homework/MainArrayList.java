package module7.homework;

import module4.homework.first.Currency;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainArrayList {
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

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(56788, 200, Currency.USD, "lux", "qwe", user1));
        orders.add(new Order(56789, 100, Currency.USD, "standart", "qwe", user2));
        orders.add(new Order(56789, 150, Currency.USD, "lux", "qwe", user3));
        orders.add(new Order(56789, 200, Currency.USD, "norm", "qwe", user4));
        orders.add(new Order(16789, 300, Currency.USD, "standart", "qwe", user5));
        orders.add(new Order(16789, 200, Currency.USD, "king", "qwe", user6));
        orders.add(new Order(16789, 190, Currency.USD, "lux", "qwe", user7));
        orders.add(new Order(16788, 205, Currency.USD, "lux", "qwe", user8));
        orders.add(new Order(16789, 510, Currency.USD, "king", "qwe", user9));
        orders.add(new Order(16789, 400, Currency.USD, "norm", "qwe", user10));

        //за ценой заказа по убыванию
        orders = orders.stream().sorted().collect(Collectors.toList());

        //за ценой заказа по возростанию
        orders = orders.stream().sorted(Comparator.comparingInt(Order::getPrice)).collect(Collectors.toList());

        //за ценой заказа по возрастанию и за городом пользователя
        orders = orders.stream().sorted(((o1, o2) -> o1.getPrice() != o2.getPrice()
                ? Integer.compare(o1.getPrice(), o2.getPrice())
                : o1.getUser().getCity().compareTo(o2.getUser().getCity()))).collect(Collectors.toList());

        //за наименованием и идентификатором заказа, и городом пользователя
        orders = orders.stream().sorted(((o1, o2) -> !o1.getItemName().equals(o2.getItemName())
                ? o1.getItemName().compareTo(o2.getItemName())
                : (o1.getId() != o2.getId()
                ? Long.compare(o1.getId(), o2.getId())
                : o1.getUser().getCity().compareTo(o2.getUser().getCity())))).collect(Collectors.toList());

        //вывод результата
        orders.forEach(System.out::println);

    }
}
