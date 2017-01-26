package module7.homework;

import module4.homework.first.Currency;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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
        orders.add(new Order(56788, 2000, Currency.USD, "lux", "qwe", user1));
        orders.add(new Order(56789, 1000, Currency.USD, "standart", "qwe", user2));
        orders.add(orders.get(1));
        orders.add(new Order(56789, 1500, Currency.USD, "lux", "qwe", user3));
        orders.add(new Order(56789, 2000, Currency.EUR, "norm", "qwe", user4));
        orders.add(new Order(16789, 2000, Currency.EUR, "king", "qwe", user6));
        orders.add(new Order(16789, 1900, Currency.USD, "lux", "qwe", user7));
        orders.add(new Order(16788, 2050, Currency.USD, "lux", "qwe", user8));
        orders.add(new Order(16789, 5100, Currency.USD, "king", "qwe", user9));
        orders.add(new Order(16789, 4000, Currency.USD, "norm", "qwe", user10));

        //за ценой заказа по убыванию
        orders = orders.stream().sorted().collect(Collectors.toList());

        //за ценой заказа по возростанию
        orders = orders.stream().sorted(Comparator.comparingInt(Order::getPrice)).collect(Collectors.toList());

        //за ценой заказа по возрастанию и за городом пользователя
        orders = orders.stream().sorted(((o1, o2) -> o1.getPrice() != o2.getPrice()
                ? Integer.compare(o1.getPrice(), o2.getPrice())
                : o1.getUser().getCity().compareTo(o2.getUser().getCity()))).collect(Collectors.toList());

        //за наименованием и идентификатором заказа, и городом пользователя
        orders = orders.stream().sorted(Comparator.comparing(Order::getItemName)
                .thenComparing(Comparator.comparing(Order::getId))
                .thenComparing(Comparator.comparing(p -> p.getUser().getCity()))).collect(Collectors.toList());

        //удалите дублированные данные со списка
        orders = orders.stream().sorted().distinct().collect(Collectors.toList());

        //удалите объекты, где цена меньше 1500
        orders.removeIf(p -> p.getPrice() < 1500);

        //разделите список на 2 списка - заказы в долларах и в эвро
        Map<Currency, List<Order>> newMap1
                = orders.stream().collect(Collectors.groupingBy(Order::getCurrency, Collectors.toList()));
        System.out.println(newMap1);

        //разделите список на столько списков, сколько уникальных городов в User
        Map<String, List<Order>> newMap2
                = orders.stream().collect(Collectors.groupingBy(p -> p.getUser().getCity()));
        System.out.println(newMap2);

        //вывод результата
        orders.forEach(System.out::println);


    }
}
