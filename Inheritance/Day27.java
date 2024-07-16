package Inheritance;

import java.util.Arrays;

public class Day27 extends User {
    // Fields common to both Instructor and Student
    private String[] coursesTaught;
    private String grade;

    // Fields specific to Instructor
    private String qualification;
    private double salary;

    // Fields specific to Student
    private int joiningYear;
    private String[] registeredCourses;

    // Constructor for Instructor
    public Day27(String name, String email, int age, String qualification, String[] coursesTaught, double salary) {
        super(name, email, age);
        this.qualification = qualification;
        this.coursesTaught = coursesTaught;
        this.salary = salary;
    }

    // Constructor for Student
    public Day27(String name, String email, int age, String[] registeredCourses, String grade, int joiningYear) {
        super(name, email, age);
        this.registeredCourses = registeredCourses;
        this.grade = grade;
        this.joiningYear = joiningYear;
    }

    // Getters and setters for common fields
    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Getters and setters for Instructor-specific fields
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getters and setters for Student-specific fields
    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    public String[] getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(String[] registeredCourses) {
        this.registeredCourses = registeredCourses;
    }

    // Override toString method to display relevant information
    @Override
    public String toString() {
        if (coursesTaught != null) {
            return "Instructor Details:\n" +
                    "Name: " + getName() + "\n" +
                    "Email: " + getEmail() + "\n" +
                    "Age: " + getAge() + "\n" +
                    "Qualification: " + qualification + "\n" +
                    "Courses Taught: " + Arrays.toString(coursesTaught) + "\n" +
                    "Salary: $" + salary;
        } else {
            return "Student Details:\n" +
                    "Name: " + getName() + "\n" +
                    "Email: " + getEmail() + "\n" +
                    "Age: " + getAge() + "\n" +
                    "Registered Courses: " + Arrays.toString(registeredCourses) + "\n" +
                    "Grade: " + grade + "\n" +
                    "Joining Year: " + joiningYear;
        }
    }

    // Example usage in a main method or elsewhere
    public static void main(String[] args) {
        String[] coursesTaught = {"Math", "Physics"};
        Day27 instructor = new Day27("Alice", "alice@gmail.com", 35, "PhD in Physics", coursesTaught, 75000.0);

        String[] registeredCourses = {"Math", "Computer Science"};
        Day27 student = new Day27("Bob", "bob@gmail.com", 20, registeredCourses, "A", 2022);

        System.out.println(instructor.toString());
        System.out.println();
        System.out.println(student.toString());
    }
}
