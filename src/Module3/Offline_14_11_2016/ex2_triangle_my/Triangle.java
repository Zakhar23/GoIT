package Module3.Offline_14_11_2016.ex2_triangle_my;

public class Triangle {
    private Point x,y,z;

    public Triangle(Point x, Point y, Point z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void print() {
        System.out.println(area());
        System.out.println("ploshad");
    }

    public int area() {
        return 2;
    }

    public int perimetr() {
        return 5;
    }
}
