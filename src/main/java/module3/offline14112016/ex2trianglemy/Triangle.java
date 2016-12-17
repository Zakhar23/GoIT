package module3.offline14112016.ex2trianglemy;

public class Triangle {
    private Point aa;
    private Point bb;
    private Point cc;
    private double ab;
    private double ac;
    private double bc;

    public Triangle(Point aa, Point bb, Point cc) {
        double abCheck = getLengthOfLine(aa, bb);
        double acCheck = getLengthOfLine(aa, cc);
        double bcCheck = getLengthOfLine(bb, cc);

        if ((abCheck >= acCheck + bcCheck) || (acCheck >= abCheck + bcCheck) || (bcCheck >= abCheck + acCheck)) {
            System.out.println("Получился не треугольник: "
                    + "если сумма любих двух сторон меньше равно третей, значит треугольника НЕ существует");
            return;
        }

        this.aa = aa;
        this.bb = bb;
        this.cc = cc;
        this.ab = abCheck;
        this.ac = acCheck;
        this.bc = bcCheck;
    }

    private double getLengthOfLine(Point aa, Point bb) {
        //AB = √(xb - xa)2 + (yb - ya)2
        return Math.sqrt(Math.pow(bb.xx - aa.xx, 2) + Math.pow(bb.yy - aa.yy, 2));
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
        return Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
    }


}
