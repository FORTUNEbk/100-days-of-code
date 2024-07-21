package Day32;

public class Student extends Person {
    private String course;

    public Student(String name, String course) {
        super(name);
        this.course = course;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Role: Student");
        System.out.println("Course: " + course);
    }
}

