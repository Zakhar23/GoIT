package module3.offline14112016.ex2triangle_my;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        Point c = new Point(3, 3);

        Triangle miniTriangle = new Triangle(a, b, c);

        miniTriangle.print();
    }
}
