package module8.offline26122016.task1;

public class Circle extends Shape {
    private final int radiuse;

    public Circle(Point startPoint, int radiuse) {
        super(startPoint);
        this.radiuse = radiuse;
    }

    @Override
    public String toString() {
       // return super.toString ();
        return "Circle:" + super.toString () + ", radiuse " + radiuse;
    }
}
