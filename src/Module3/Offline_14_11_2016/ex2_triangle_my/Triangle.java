package Module3.Offline_14_11_2016.ex2_triangle_my;

public class Triangle {
    private Point a, b, c;
    private double ab, ac, bc;
    //http://ru.onlinemschool.com/math/library/analytic_geometry/point_point_length/

    public Triangle(Point a, Point b, Point c) {
        double abCheck = getLengthOfLine(a, b);
        double acCheck = getLengthOfLine(a, c);
        double bcCheck = getLengthOfLine(b, c);

        if ((abCheck >= acCheck + bcCheck) || (acCheck >= abCheck + bcCheck) || (bcCheck >= abCheck + acCheck)) {
            System.out.println("Получился не треугольник: " +
                    "если сумма любих двух сторон меньше равно третей, значит треугольника НЕ существует");
            return;
        }

        this.a = a;
        this.b = b;
        this.c = c;
        this.ab = abCheck;
        this.ac = acCheck;
        this.bc = bcCheck;
    }

    private double getLengthOfLine(Point a, Point b) {
        //AB = √(xb - xa)2 + (yb - ya)2
        return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
    }

    public void print() {
        System.out.println("Периметр = " + perimetr());
        System.out.println("Площадь = " + area());
    }

    private double perimetr() {
        return ab + ac + bc;
    }

    private double area() {
        double p = (ab + ac + bc) / 2;
        double s = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        return s;
    }


}
