package module3.offline14112016.ex1convert;

public class ExchangeUSD {
    private int course;

    public ExchangeUSD(int course) {
        this.course = course;
    }

    public int convert(int countGrn) {
        return countGrn * this.course;
    }
}
