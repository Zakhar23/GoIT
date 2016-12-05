package main.java.Module3.Offline_14_11_2016.ex1_convert;

public class Main {
    public static void main(String[] args) {
        ExchangeUSD exchangeUSD = new ExchangeUSD(26);

        System.out.println(exchangeUSD.convert(10));
    }
}
