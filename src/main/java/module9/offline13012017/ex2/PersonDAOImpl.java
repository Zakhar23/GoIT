package module9.offline13012017.ex2;

import module7.homework.User;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDAO {
    List<Person> list = new ArrayList<>();

    @Override
    public void save(Person person) {
        list.add(person);
    }

    @Override
    public Person findByEmail(Person person) {
        for (Person pers : list) {
            //if (pers.g)
        }
        return null;
    }
}
