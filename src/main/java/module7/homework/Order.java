package module7.homework;

import module4.homework.first.Currency;

public class Order implements Comparable<Order> {
    long id;
    int price;
    Currency currency;
    String itemName;
    String shopIdentificator;
    User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    @Override
    public int compareTo(Order order) {
        return order.price - price;
    }

}
