package module5.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    API[] apis = new API[3];

    public Controller(API[] apis) {
        this.apis = apis;
    }

    List<Room> requstRooms(int price, int persons, String city, String hotel) {
        List<Room> foundRooms = new ArrayList<>();
        for (API item : apis) {
            List<Room> rooms = item.findRooms(price, persons, city, hotel);
            if (rooms.size() == 0) {
                continue;
            }

            for (Room i : rooms) {
                foundRooms.add(i);
            }
        }
        return foundRooms;
    }

    Room[] check(API api1, API api2) {
        return new Room[0];
    }
}

