package Day44;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            conn.setAutoCommit(false);

            try (PreparedStatement pstmt1 = conn.prepareStatement("INSERT INTO students (name, age) VALUES (?, ?)");
                 PreparedStatement pstmt2 = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?")) {

                pstmt1.setString(1, "Jane Doe");
                pstmt1.setInt(2, 20);
                pstmt1.executeUpdate();

                pstmt2.setInt(1, 500);
                pstmt2.setInt(2, 1);
                pstmt2.executeUpdate();

                conn.commit();
                System.out.println("Transaction committed successfully!.");
                
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Transaction rolled back due to an error!.");
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

