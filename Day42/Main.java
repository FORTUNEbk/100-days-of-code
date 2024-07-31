import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/your_database";

        String username = "your_username";
        String password = "your_password";

        try {

        Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected to the database successfully!");

            connection.close();
        } catch (SQLException e) {
            System.out.println("An error occurred while connecting to the database.");
            e.printStackTrace();
        }
    }
}
