package module9.offline13012017.ex2;

public interface PersonDAO {
    void save(Person person);

    Person findByEmail(Person person);
}
