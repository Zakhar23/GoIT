package Module5.Offline_26_11_2016.first;

public class Main {
    public static void main(String[] args) {
        User user = new User(6566875L, "Userok");
        user.setConnection(Connection.getInstance());

        User user2 = new User(6566875L, "Userok2");
        user2.setConnection(Connection.getInstance());

        System.out.println(user.getConnection());
        System.out.println(user2.getConnection());

    }
}
