package Module4.HomeWork.HwFirst;

import Module4.HomeWork.HwSecond.Currency;

public class Main {
    Bank usBankUSD = new USBank(123456789, "USA", Currency.USD, 6, 1000, 987654321, 5000000);
    Bank usBankEUR = new USBank(123456789, "USA", Currency.EUR, 6, 1000, 987654321, 5000000);
    Bank euBankUSD = new EUBank(123456788, "France", Currency.USD, 8, 1000, 987654321, 50000);
    Bank euBankEUR = new EUBank(123456788, "France", Currency.EUR, 8, 1000, 987654321, 50000);
    Bank chinaBankUSD = new ChinaBank(123456787, "China", Currency.USD, 3, 1000, 987654321, 700000);
    Bank chinaBankEUR = new ChinaBank(123456787, "China", Currency.EUR, 3, 1000, 987654321, 700000);

    User user1 = new User(4445211, "Mike", 1000, 4, "BGS", 100, usBankUSD);
    User user2 = new User(4445211, "Nick", 1000, 4, "BGS", 100, usBankEUR);

    User user3 = new User(4445211, "Big", 1000, 4, "BGS", 100, euBankUSD);
    User user4 = new User(4445211, "Loly", 1000, 4, "BGS", 100, euBankEUR);

    User user5 = new User(4445211, "Sarah", 1000, 4, "BGS", 100, chinaBankUSD);
    User user6 = new User(4445211, "Ban", 1000, 4, "BGS", 100, chinaBankEUR);


}
