package module3.offline14112016.ex2trianglemy;

public class Triangle {
    private Point a, b, c;
    private double ab, ac, bc;
    //http://ru.onlinemschool.com/math/library/analytic_geometry/point_point_length/

    public Triangle(Point aa, Point bb, Point cc) {
        double abCheck = getLengthOfLine(aa, bb);
        double acCheck = getLengthOfLine(aa, cc);
        double bcCheck = getLengthOfLine(bb, cc);

        if ((abCheck >= acCheck + bcCheck) || (acCheck >= abCheck + bcCheck) || (bcCheck >= abCheck + acCheck)) {
            System.out.println("Получился не треугольник: " +
                    "если сумма любих двух сторон меньше равно третей, значит треугольника НЕ существует");
            return;
        }

        this.a = aa;
        this.b = bb;
        this.c = cc;
        this.ab = abCheck;
        this.ac = acCheck;
        this.bc = bcCheck;
    }

    private double getLengthOfLine(Point aa, Point bb) {
        //AB = √(xb - xa)2 + (yb - ya)2
        return Math.sqrt(Math.pow(bb.x - aa.x, 2) + Math.pow(bb.y - aa.y, 2));
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
