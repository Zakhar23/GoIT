package module5.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoogleAPI implements API {
    List<Room> rooms = new ArrayList<>();

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> foundRooms = new ArrayList<>();
        for (Room room : rooms) {
            if ((room.getPrice() == price) && (room.getPersons() == persons)
                    && (room.getCityName().equals(city)) && (room.getHotelName().equals(hotel))) {
                foundRooms.add(room);
            }
        }
        return foundRooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
