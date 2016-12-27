package module8.offline26122016.task1;

import java.util.ArrayList;
import java.util.List;

public class UseShapes {
    public static void main(String[] args) {
        int p1 = 1;
        int p2 = 2;
        Rectangle rectangle1 = new Rectangle(new Point(p1, p2), 3, 5);
        Rectangle rectangle2 = new Rectangle(new Point(p1, p2), 3, 5);
        Rectangle rectangle3 = new Rectangle(new Point(p1, p2), 3, 5);

        Circle circle1 = new Circle (new Point (p1, p2), 5);

        Group group = new Group();

        group.add(rectangle1);
        group.add (circle1);

        //System.out.println(group.getListFigure());

        List<Shape> all = group.getListFigure();
        for (Shape shape : all) {
            System.out.println (shape);
        }
    }
}
