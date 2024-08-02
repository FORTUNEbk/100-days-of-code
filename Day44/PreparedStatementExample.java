package Day44;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";
        String query = "INSERT INTO students (name, age) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, "John Doe");
            pstmt.setInt(2, 22);
            pstmt.executeUpdate();
            System.out.println("Record inserted successfully.");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
