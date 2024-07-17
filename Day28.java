public class Day28 {

    public static void main(String[] args) {

        Instructor instructor = new Instructor("Gregory kamau", 50000.0);

        System.out.println("Initial Salary: Ksh" + instructor.getSalary());

        instructor.incrementSalary(10);
        System.out.println("Salary after 10% increment: Ksh" + instructor.getSalary());

        instructor.incrementSalary(5, 2000);
        System.out.println("Salary after 5% increment and Ksh2000 bonus: Ksh" + instructor.getSalary());
    }
}

class Instructor {
    private String name;
    private double salary;

    public Instructor(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void incrementSalary(int percent) {
        double incrementAmount = salary * percent / 100.0;
        salary += incrementAmount;
    }

    public void incrementSalary(int percent, int bonus) {
        incrementSalary(percent);
        salary += bonus;
    }

    public double getSalary() {
        return salary;
    }
}
