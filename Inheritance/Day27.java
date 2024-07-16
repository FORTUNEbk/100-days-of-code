package Inheritance;

import java.util.Arrays;

public class Day27 extends User {
    private String[] coursesTaught;
    private String grade;

    private String qualification;
    private double salary;

    private int joiningYear;
    private String[] registeredCourses;

    public Day27(String name, String email, int age, String qualification, String[] coursesTaught, double salary) {
        super(name, email, age);
        this.qualification = qualification;
        this.coursesTaught = coursesTaught;
        this.salary = salary;
    }

    public Day27(String name, String email, int age, String[] registeredCourses, String grade, int joiningYear) {
        super(name, email, age);
        this.registeredCourses = registeredCourses;
        this.grade = grade;
        this.joiningYear = joiningYear;
    }

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

    public static void main(String[] args) {
        String[] coursesTaught = {"Math", "Physics"};
        Day27 instructor = new Day27("Alice", "aliceK@gmail.com", 35, "PhD in Physics", coursesTaught, 75000.0);

        String[] registeredCourses = {"Math", "Computer Science"};
        Day27 student = new Day27("Bob", "boby@gmail.com", 20, registeredCourses, "A", 2022);

        System.out.println(instructor.toString());
        System.out.println();
        System.out.println(student.toString());
    }
}
