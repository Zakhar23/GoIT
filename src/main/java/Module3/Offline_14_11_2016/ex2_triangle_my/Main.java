package main.java.Module3.Offline_14_11_2016.ex2_triangle_my;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        Point c = new Point(3, 3);

        Triangle miniTriangle = new Triangle(a, b, c);

        miniTriangle.print();
    }
}
