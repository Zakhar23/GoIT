package module8.homework;

import java.util.ArrayList;
import java.util.List;

public class UserDAO extends AbstractDAOImpl {
    public User save(User user) {
        return (User) super.save(user);
    }

    public void delete(User user) {
        super.delete(user);
    }

    public void deleteAll(List list) {
        super.deleteAll(list);
    }

    public void saveAll(List list) {
        super.saveAll(list);
    }

    public List getList() {
        return super.getList();
    }

    public void deleteById(long id) {
        List<User> list = getList();
        List<User> listDel = new ArrayList<>();
        for (User item : list) {
            if (item.getId() == id) {
                listDel.add(item);
            }
        }
        super.deleteAll(listDel);
    }

    public User get(long id) {
        List<User> list = getList();
        for (User item : list) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void setList(List list) {
        super.setList(list);
    }
}
