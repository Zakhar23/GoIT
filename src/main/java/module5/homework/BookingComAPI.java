package module5.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookingComAPI implements API {
    List<Room> rooms = new ArrayList<>();

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        return rooms.stream().filter(p -> p.getPrice() == price
                && p.getPersons() == persons
                && p.getCityName().equals(city)
                && p.getHotelName().equals(hotel)).collect(Collectors.toList());
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
