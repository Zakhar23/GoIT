package Module3.Offline_14_11_2016.ex2_triangle;

/**
 * Created by Home on 14.11.2016.
 */
public class Triangle {

    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;
    private final int x3;
    private final int y3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    private double square() {
        double line1 = calculateLine(x1,y1,x2,y2);
        double line2 = calculateLine(x1,y1,x3,y3);
        double line3 = calculateLine(x2,y2,x3,y3);

        return 2;
    }

    private double calculateLine(int x2, int y2, int x3, int y3) {

        return 1;
    }
}
