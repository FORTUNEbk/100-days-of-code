package Day46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchProcessingExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Sample_db";
        String user = "root";
        String password = "phsyco2003";

        String insertQuery = "INSERT INTO students (name, age) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {

            conn.setAutoCommit(false);  // Disable auto-commit mode

            // Adding multiple insert statements to the batch
            pstmt.setString(1, "John Doe");
            pstmt.setInt(2, 22);
            pstmt.addBatch();

            pstmt.setString(1, "Jane Smith");
            pstmt.setInt(2, 21);
            pstmt.addBatch();

            pstmt.setString(1, "Mike Brown");
            pstmt.setInt(2, 23);
            pstmt.addBatch();

            // Execute the batch
            int[] updateCounts = pstmt.executeBatch();
            conn.commit();  // Commit the transaction

            System.out.println("Batch executed successfully. Rows affected: " + updateCounts.length);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
