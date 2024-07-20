package Day31;

public class Instructor implements InstructorInterface {
    private String name;
    private double salary;

    public Instructor(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void incrementSalary(double increment) {
        this.salary += increment;
    }

    @Override
    public void incrementSalary(double percentage, boolean isPercentage) {
        if (isPercentage) {
            this.salary += this.salary * (percentage / 100);
        } else {
            this.salary += percentage;
        }
    }

}
