package module8.homework;

import java.util.List;

public class UserDAO extends AbstractDAOImpl<User> {
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

    public void deleteById(long id) {
        listDB.removeIf(p -> p.getId() == id);
    }

    public User get(long id) {
        return listDB.stream().filter((p) -> p.getId() == id).findFirst().orElse(null);
    }
}
