package main.java.module4.homeWork.hwFirst;

public class Main {
    public static void main(String[] args) {
        BankSystemImpl operations = new BankSystemImpl();
        Bank usBankUSD = new USBank("USBankUSD", 123456789L, "USA", Currency.USD, 6, 1000, 987654321L, 5000000L);
        Bank usBankEUR = new USBank("USBankEUR", 123456799L, "USA", Currency.EUR, 6, 2000, 987654321L, 5000000L);
        Bank euBankUSD = new EUBank("EUBankUSD", 123456788L, "France", Currency.USD, 8, 1000, 987654321L, 50000L);
        Bank euBankEUR = new EUBank("EUBankEUR", 123456798L, "France", Currency.EUR, 8, 3000, 987654321L, 50000L);
        Bank chinaBankUSD = new ChinaBank("ChinaBankUSD", 123456787L, "China", Currency.USD, 3, 8000, 987654321L, 700000L);
        Bank chinaBankEUR = new ChinaBank("ChinaBankEUR", 123456797L, "China", Currency.EUR, 3, 9000, 987654321L, 700000L);

        User user1 = new User(4445214L, "Mike", 1100, 4, "BGS", 100, usBankUSD);
        User user2 = new User(4445233L, "Nick", 1000, 4, "BGS", 100, usBankEUR);

        User user3 = new User(4445215L, "Big", 1000, 4, "BGS", 100, euBankUSD);
        User user4 = new User(4445232L, "Lola", 1000, 4, "BGS", 100, euBankEUR);

        User user5 = new User(4445216L, "Sarah", 1000, 4, "BGS", 100, chinaBankUSD);
        User user6 = new User(4445231L, "Ban", 1000, 4, "BGS", 100, chinaBankEUR);

        System.out.println("user 1");
        operations.withdrawOfUser(user1, 100);
        operations.fundUser(user1, 20);
        operations.paySalary(user1);
        operations.transferMoney(user6, user1, 10);
        System.out.println(user1.toString());
        System.out.println("-----------------");

        System.out.println("user 2");
        operations.withdrawOfUser(user2, 100);
        operations.fundUser(user2, 20);
        operations.paySalary(user2);
        operations.transferMoney(user1, user2, 10);
        System.out.println(user2.toString());
        System.out.println("-----------------");

        System.out.println("user 3");
        operations.withdrawOfUser(user3, 100);
        operations.fundUser(user3, 20);
        operations.paySalary(user3);
        operations.transferMoney(user2, user3, 10);
        System.out.println(user3.toString());
        System.out.println("-----------------");

        System.out.println("user 4");
        operations.withdrawOfUser(user4, 100);
        operations.fundUser(user4, 20);
        operations.paySalary(user4);
        operations.transferMoney(user3, user4, 10);
        System.out.println(user4.toString());
        System.out.println("-----------------");

        System.out.println("user 5");
        operations.withdrawOfUser(user5, 100);
        operations.fundUser(user5, 20);
        operations.paySalary(user5);
        operations.transferMoney(user4, user5, 10);
        System.out.println(user5.toString());
        System.out.println("-----------------");

        System.out.println("user 6");
        operations.withdrawOfUser(user6, 100);
        operations.fundUser(user6, 20);
        operations.paySalary(user6);
        operations.transferMoney(user5, user6, 10);
        System.out.println(user6.toString());
        System.out.println("-----------------");

    }
}
