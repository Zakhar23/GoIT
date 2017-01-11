package module8.homework;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    private List<T> list = new ArrayList<T>();

    @Override
    public T save(T t) {
        list.add(t);
        return t;
    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void deleteAll(List T) {

    }

    @Override
    public void saveAll(List T) {

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

