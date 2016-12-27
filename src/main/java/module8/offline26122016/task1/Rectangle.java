package module8.offline26122016.task1;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Point startPoint, int width, int height) {
        super(startPoint);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle:" + super.toString () + ", width " + width + ", height " + height;
    }
}
