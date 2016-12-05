package main.java.module5.homework;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        API[] apiArray = new API[3];

        Room[] bookingComApiRooms = new Room[5];
        bookingComApiRooms[0] = new Room(98659935L, 100, 2,
                new Date(1480879871), "Transilvania", "Kiev");
        bookingComApiRooms[1] = new Room(18654235L, 500, 1,
                new Date(1480879871), "Hilton", "Kiev");
        bookingComApiRooms[2] = new Room(33654235L, 300, 8,
                new Date(1480879871), "Transilvania", "Kiev");
        bookingComApiRooms[3] = new Room(34554235L, 100, 1,
                new Date(1480879871), "Transilvania", "Kiev");
        bookingComApiRooms[4] = new Room(98123456L, 150, 4,
                new Date(1480879871), "Transilvania", "Kiev");

        BookingComAPI bookingComApi = new BookingComAPI();
        bookingComApi.setRooms(bookingComApiRooms);

        Room[] googleAPIRooms = new Room[5];
        googleAPIRooms[0] = new Room(98659935L, 100, 2,
                new Date(1480879871), "Transilvania", "Kiev");
        googleAPIRooms[1] = new Room(18654235L, 200, 3,
                new Date(1480879871), "Transilvania", "Kiev");
        googleAPIRooms[2] = new Room(33654235L, 300, 8,
                new Date(1480879871), "Transilvania", "Kiev");
        googleAPIRooms[3] = new Room(34554235L, 500, 1,
                new Date(1480879871), "Hilton", "Kiev");
        googleAPIRooms[4] = new Room(98123456L, 150, 4,
                new Date(1480879871), "Transilvania", "Kiev");

        GoogleAPI googleAPI = new GoogleAPI();
        googleAPI.setRooms(googleAPIRooms);

        Room[] tripAdvisorAPIRooms = new Room[5];
        tripAdvisorAPIRooms[0] = new Room(98611935L, 100, 2,
                new Date(1480879871), "Transilvania", "Kiev");
        tripAdvisorAPIRooms[1] = new Room(18654235L, 200, 3,
                new Date(1480879871), "Transilvania", "Kiev");
        tripAdvisorAPIRooms[2] = new Room(33654235L, 300, 10,
                new Date(1480879871), "Transilvania", "Kiev");
        tripAdvisorAPIRooms[3] = new Room(34554235L, 100, 1,
                new Date(1480879871), "Transilvania", "Kiev");
        tripAdvisorAPIRooms[4] = new Room(98123456L, 150, 4,
                new Date(1480879871), "Transilvania", "Kiev");

        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        tripAdvisorAPI.setRooms(tripAdvisorAPIRooms);

        apiArray[0] = bookingComApi;
        apiArray[1] = googleAPI;
        apiArray[2] = tripAdvisorAPI;

        Controller controller = new Controller(apiArray);

        Room[] rooms1 = controller.requstRooms(100, 2, "Kiev", "Transilvania");
        System.out.println(Arrays.deepToString(rooms1));

        Room[] rooms2 = controller.requstRooms(300, 10, "Kiev", "Transilvania");
        System.out.println(Arrays.deepToString(rooms2));

        Room[] rooms3 = controller.requstRooms(500, 1, "Kiev", "Hilton");
        System.out.println(Arrays.deepToString(rooms3));


    }
}
