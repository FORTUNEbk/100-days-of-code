package Day43;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseOperations {

    private Connection connect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "password";
        return DriverManager.getConnection(url, user, password);
    }

    public void insertInstructor(String firstName, String lastName, String email, double salary, Date hireDate) throws SQLException {
        String query = "INSERT INTO Instructors (first_name, last_name, email, salary, hire_date) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, email);
            stmt.setDouble(4, salary);
            stmt.setDate(5, hireDate);
            stmt.executeUpdate();
        }
    }

    public void readInstructors() throws SQLException {
        String query = "SELECT * FROM Instructors";
        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("first_name") + " " + rs.getString("last_name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Salary: " + rs.getDouble("salary"));
                System.out.println("Hire Date: " + rs.getDate("hire_date"));
                System.out.println();
            }
        }
    }

    public void updateInstructor(int id, double newSalary) throws SQLException {
        String query = "UPDATE Instructors SET salary = ? WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setDouble(1, newSalary);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        }
    }

    public void deleteInstructor(int id) throws SQLException {
        String query = "DELETE FROM Instructors WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}

