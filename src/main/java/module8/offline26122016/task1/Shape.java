package module8.offline26122016.task1;

abstract public class Shape {
    private Point startPoint;

    public Shape(Point startPoint) {
        this.startPoint = startPoint;
    }

    @Override
    public String toString() {
        return "P{" + startPoint.getXx () + " " + startPoint.getYy () + "}";
    }
}
