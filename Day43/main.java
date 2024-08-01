package Day43;

import java.sql.Date;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) {
        DatabaseOperations dbOps = new DatabaseOperations();
        try {
            dbOps.insertInstructor("John", "Doe", "john.doe@example.com", 75000, Date.valueOf("2020-05-15"));
            dbOps.readInstructors();
            dbOps.updateInstructor(1, 80000);
            dbOps.deleteInstructor(1);
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
