package module5.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        API[] apiArray = new API[3];

        List<Room> bookingComApiRooms = new ArrayList<>();
        bookingComApiRooms.add(new Room(98659935L, 100, 2,
                new Date(1480879871), "Transilvania", "Kiev"));
        bookingComApiRooms.add(new Room(18654235L, 500, 1,
                new Date(1480879871), "Hilton", "Kiev"));
        bookingComApiRooms.add(new Room(33654235L, 300, 8,
                new Date(1480879871), "Transilvania", "Kiev"));
        bookingComApiRooms.add(new Room(34554235L, 100, 1,
                new Date(1480879871), "Transilvania", "Kiev"));
        bookingComApiRooms.add(new Room(98123456L, 150, 4,
                new Date(1480879871), "Transilvania", "Kiev"));

        BookingComAPI bookingComApi = new BookingComAPI();
        bookingComApi.setRooms(bookingComApiRooms);

        List<Room> googleAPIRooms = new ArrayList<>();
        googleAPIRooms.add(new Room(98659935L, 100, 2,
                new Date(1480879871), "Transilvania", "Kiev"));
        googleAPIRooms.add(new Room(18654235L, 200, 3,
                new Date(1480879871), "Transilvania", "Kiev"));
        googleAPIRooms.add(new Room(33654235L, 300, 8,
                new Date(1480879871), "Transilvania", "Kiev"));
        googleAPIRooms.add(new Room(34554235L, 500, 1,
                new Date(1480879871), "Hilton", "Kiev"));
        googleAPIRooms.add(new Room(98123456L, 150, 4,
                new Date(1480879871), "Transilvania", "Kiev"));

        GoogleAPI googleAPI = new GoogleAPI();
        googleAPI.setRooms(googleAPIRooms);

        List<Room> tripAdvisorAPIRooms = new ArrayList<>();
        tripAdvisorAPIRooms.add(new Room(98611935L, 100, 2,
                new Date(1480879871), "Transilvania", "Kiev"));
        tripAdvisorAPIRooms.add(new Room(18654235L, 200, 3,
                new Date(1480879871), "Transilvania", "Kiev"));
        tripAdvisorAPIRooms.add(new Room(33654235L, 300, 10,
                new Date(1480879871), "Transilvania", "Kiev"));
        tripAdvisorAPIRooms.add(new Room(34554235L, 100, 1,
                new Date(1480879871), "Transilvania", "Kiev"));
        tripAdvisorAPIRooms.add(new Room(98123456L, 150, 4,
                new Date(1480879871), "Transilvania", "Kiev"));

        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        tripAdvisorAPI.setRooms(tripAdvisorAPIRooms);

        apiArray[0] = bookingComApi;
        apiArray[1] = googleAPI;
        apiArray[2] = tripAdvisorAPI;

        Controller controller = new Controller(apiArray);

        List<Room> rooms1 = controller.requstRooms(100, 2, "Kiev", "Transilvania");
        System.out.println(rooms1);

        List<Room> rooms2 = controller.requstRooms(300, 10, "Kiev", "Transilvania");
        System.out.println(rooms2);

        List<Room> rooms3 = controller.requstRooms(500, 1, "Kiev", "Hilton");
        System.out.println(rooms3);

    }
}
