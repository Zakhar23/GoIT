package module8.homework;

import java.util.List;

public interface AbstractDAO<T> {
    T save(T obj);

    void delete(T obj);

    void deleteAll(List list);

    void saveAll(List list);

    List<T> getList();

    void deleteByld(long id);

    T get(long id);
}
