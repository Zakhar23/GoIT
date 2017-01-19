package module8.homework;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    private List<T> list = new ArrayList<T>();

    @Override
    public T save(T obj) {
        list.add(obj);
        return obj;
    }

    @Override
    public void delete(T obj) {
        for (T item : list) {
            if (item.equals(obj)) {
                list.remove(item);
            }
        }
    }

    @Override
    public void deleteAll(List<T> somelist) {
        list.removeAll(somelist);
    }

    @Override
    public void saveAll(List<T> somelist) {
        list.addAll(somelist);
    }

    @Override
    public List<T> getList() {
        return list;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public T get(long id) {
        return null;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}

