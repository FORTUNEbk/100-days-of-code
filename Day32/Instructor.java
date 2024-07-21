package Day32;

public class Instructor extends Person {
    private double salary;

    public Instructor(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Role: Instructor");
        System.out.println("Salary: " + salary);
    }

    public void incrementSalary(double amount) {
        this.salary += amount;
    }

    public void incrementSalary(double amount, double bonus) {
        this.salary += amount + bonus;
    }
}

