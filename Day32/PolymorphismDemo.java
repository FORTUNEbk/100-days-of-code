package Day32;

public class PolymorphismDemo{
    public static void main(String[] args) {
        Person person1 = new Instructor("Alice", 50000);
        Person person2 = new Student("Bob", "Computer Science");

        person1.display();
        person2.display();

        if (person1 instanceof Instructor) {
            Instructor instructor = (Instructor) person1;
            instructor.incrementSalary(5000);
            instructor.display();
        }

        if (person1 instanceof Instructor) {
            Instructor instructor = (Instructor) person1;
            instructor.incrementSalary(3000, 1000);
            instructor.display();
        }
    }
}

