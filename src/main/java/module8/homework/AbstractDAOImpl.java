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

    }

    @Override
    public void deleteAll(List listT) {
        list = new ArrayList<T>();
    }

    @Override
    public void saveAll(List somelist) {
        for (Object item : somelist) {
            list.add((T) item);
        }
    }

    @Override
    public List<T> getList() {
        return list;
    }

    @Override
    public void deleteByld(long id) {

    }

    @Override
    public T get(long id) {
        return null;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}

