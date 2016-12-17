package module3.offline14112016.ex1convert;

public class Main {
    public static void main(String[] args) {
        ExchangeUSD exchangeUSD = new ExchangeUSD(26);

        System.out.println(exchangeUSD.convert(10));
    }
}
