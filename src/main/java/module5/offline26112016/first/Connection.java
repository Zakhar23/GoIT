package module5.offline26112016.first;

public class Connection {
    String url = "qwe";
    private static Connection instance = new Connection();

    public static Connection getInstance() {
        return instance;
    }

}
