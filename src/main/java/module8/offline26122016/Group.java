package module8.offline26122016;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Shape> listFigure = new ArrayList<>();

    public void add(Shape figure) {
        listFigure.add(figure);
    }

    public List<Shape> getListFigure() {
        return listFigure;
    }

    public boolean isEmpty() {
        return listFigure.isEmpty();
    }

    public int size() {
        return listFigure.size();
    }

}
