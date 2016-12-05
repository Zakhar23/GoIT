package main.java.module5.homework;

import java.util.Arrays;

public class Controller {
    API apis[] = new API[3];

    public Controller(API[] apis) {
        this.apis = apis;
    }

    Room[] requstRooms(int price, int persons, String city, String hotel) {
        Room[] foundRooms = new Room[0];
        for (API item : apis) {
            Room[] rooms = item.findRooms(price, persons, city, hotel);
            if (rooms.length == 0) {
                continue;
            }

            for (Room i : rooms) {
                foundRooms = Arrays.copyOf(foundRooms, foundRooms.length + 1);
                foundRooms[foundRooms.length - 1] = i;
            }
        }
        return foundRooms;
    }

    Room[] check(API api1, API api2) {
        return new Room[0];
    }
}

