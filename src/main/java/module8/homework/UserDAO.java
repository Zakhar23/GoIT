package module8.homework;

import java.util.List;

public class UserDAO extends AbstractDAOImpl {
    public User save(User user) {
        super.save(user);
        return user;
    }

    public void delete(User user) {
        List<User> list = getList();
        for (User item : list) {
            if (item.equals(user)) {
                list.remove(item);
            }
        }
        setList(list);
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

    public void deleteByld(long id) {
        List<User> list = getList();
        for (User item : list) {
            if (item.getId() == id) {
                list.remove(item);
            }
        }
        setList(list);
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
