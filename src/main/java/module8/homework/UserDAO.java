package module8.homework;

import java.util.List;

public class UserDAO<T> extends AbstractDAOImpl<T> {
    @Override
    public T save(T t) {
        return super.save(t);
    }

    @Override
    public void delete(T t) {
        super.delete(t);
    }

    @Override
    public void deleteAll(List T) {
        super.deleteAll(T);
    }

    @Override
    public void saveAll(List T) {
        super.saveAll(T);
    }

    @Override
    public List<T> getList() {
        return super.getList();
    }

    @Override
    public void deleteByld(long id) {
        super.deleteByld(id);
    }

    @Override
    public T get(long id) {
        return super.get(id);
    }
}
