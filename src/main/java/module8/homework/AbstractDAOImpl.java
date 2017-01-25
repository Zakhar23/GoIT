package module8.homework;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDAOImpl<T> implements AbstractDAO<T> {
    protected List<T> listDB = new ArrayList<T>();

    @Override
    public T save(T obj) {
        listDB.add(obj);
        return obj;
    }

    @Override
    public void delete(T obj) {
        listDB.remove(obj);
    }

    @Override
    public void deleteAll(List<T> somelist) {
        listDB.removeAll(somelist);
    }

    @Override
    public void saveAll(List<T> somelist) {
        listDB.addAll(somelist);
    }

    @Override
    public List<T> getList() {
        return listDB;
    }
}

