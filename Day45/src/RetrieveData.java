package Day45.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/yourdatabase";
        String user = "root";
        String password = "phsyco2003";

        String query = "SELECT id, name, email FROM users";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.printf("ID: %d, Name: %s, Email: %s%n", id, name, email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
