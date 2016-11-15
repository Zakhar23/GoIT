package Module3.Offline_14_11_2016.ex1_convert;

public class ExchangeUSD {
    private int course;

    public ExchangeUSD(int course) {
        this.course = course;
    }

    public int convert(int countGrn) {
        return countGrn * this.course;
    }
}
