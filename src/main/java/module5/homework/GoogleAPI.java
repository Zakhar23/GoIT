package main.java.module5.homework;

import java.util.Arrays;

public class GoogleAPI implements API {
    Room[] rooms = new Room[5];

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] foundRooms = new Room[0];
        for (Room room : rooms) {
            if ((room.getPrice() == price) && (room.getPersons() == persons)
                    && (room.getCityName().equals(city)) && (room.getHotelName().equals(hotel))) {
                foundRooms = Arrays.copyOf(foundRooms, foundRooms.length + 1);
                foundRooms[foundRooms.length - 1] = room;
            }
        }

        return foundRooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }
}
