package Day31;

public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("John Doe", 50000);

        System.out.println("Initial Salary: " + instructor.getSalary());

        instructor.incrementSalary(5000);
        System.out.println("Salary after fixed increment: " + instructor.getSalary());

        instructor.incrementSalary(10, true); 
        System.out.println("Salary after percentage increment: " + instructor.getSalary());
    }
}
