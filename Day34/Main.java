package Day34;

public class Main {

  public static void main(String[] args) {
    Student student1 = new Student(1, "Ibrahim Nyakundi", "nyaks01.gmail.com", 25);

    System.out.println("Student ID: " + student1.getId());
    System.out.println("Student Name: " + student1.getName());
    System.out.println("Student Email: " + student1.getEmail());
    System.out.println("Student Age: " + student1.getAge());

    Instructor instructor1 = new Instructor(2, "Jeniffer murithi", "jenny0234@school.com", 75000.00);

    System.out.println("\nInstructor ID: " + instructor1.getId());
    System.out.println("Instructor Name: " + instructor1.getName());
    System.out.println("Instructor Email: " + instructor1.getEmail());
    System.out.println("Instructor Salary: Ksh" + instructor1.getSalary());
  }
}
