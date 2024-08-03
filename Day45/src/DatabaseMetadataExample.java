package Day45.src;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseMetadataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Sample_db";
        String user = "root";
        String password = "phsyco2003";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            DatabaseMetaData metaData = conn.getMetaData();

            // Get schemas
            try (ResultSet schemas = metaData.getSchemas()) {
                while (schemas.next()) {
                    System.out.println("Schema: " + schemas.getString("TABLE_SCHEM"));
                }
            }

            // Get tables
            try (ResultSet tables = metaData.getTables(null, null, null, new String[]{"TABLE"})) {
                while (tables.next()) {
                    System.out.println("Table: " + tables.getString("TABLE_NAME"));
                }
            }

            // Get columns
            try (ResultSet columns = metaData.getColumns(null, null, "yourtable", null)) {
                while (columns.next()) {
                    System.out.printf("Column: %s, Type: %s%n", columns.getString("COLUMN_NAME"), columns.getString("TYPE_NAME"));
                }
            }

            // Get indexes
            try (ResultSet indexes = metaData.getIndexInfo(null, null, "yourtable", false, false)) {
                while (indexes.next()) {
                    System.out.printf("Index: %s, Column: %s%n", indexes.getString("INDEX_NAME"), indexes.getString("COLUMN_NAME"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

