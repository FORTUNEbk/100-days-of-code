package Day45.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateMetadata {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Sample_db";
        String user = "root";
        String password = "phsyco2003";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // Add a new column to an existing table
            String alterTableSQL = "ALTER TABLE yourtable ADD COLUMN new_column VARCHAR(255)";
            stmt.executeUpdate(alterTableSQL);
            System.out.println("Table updated with new column.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

