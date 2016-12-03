package module5.homework;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Room[] rooms = controller.requstRooms(100, 2, "Kiev", "Transilvania");
        System.out.println(rooms.toString());


    }
}
