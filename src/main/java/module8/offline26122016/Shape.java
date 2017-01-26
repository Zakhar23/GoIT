package module8.offline26122016;

abstract public class Shape {
    private Point startPoint;

    Shape(Point startPoint) {
        this.startPoint = startPoint;
    }

    @Override
    public String toString() {
        return "P{" + startPoint.getXx() + " " + startPoint.getYy() + "}";
    }
}
