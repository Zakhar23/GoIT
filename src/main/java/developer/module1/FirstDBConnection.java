package developer.module1;

import java.sql.*;

/**
 * Created by Home on 24.02.2017.
 */
public class FirstDBConnection {

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
//gof patterns
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/offline", "root", "Aa111111")) {
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery("сюда запрос")) {
                    while (resultSet.next()) {
                        String name = resultSet.getString("name");
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
