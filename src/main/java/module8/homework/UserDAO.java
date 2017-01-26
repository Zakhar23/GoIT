package module8.homework;

public class UserDAO extends AbstractDAOImpl<User> {
    public void deleteById(long id) {
        listDB.removeIf(p -> p.getId() == id);
    }

    public User get(long id) {
        return listDB.stream().filter((p) -> p.getId() == id).findFirst().orElse(null);
    }
}
