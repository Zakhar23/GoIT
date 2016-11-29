package Module5.Offline_26_11_2016.first;

public class Connection {
    String url = "qwe";
    private static Connection instance = new Connection();

    public static Connection getInstance() {
        return instance;
    }

}
