package Day33;

import java.io.Serializable;

public class Instructor implements Serializable {
    private static final long serialVersionUID = 1L; 
    private String name;
    private int id;
    private double salary;

    public Instructor(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Instructor{name='" + name + "', id=" + id + ", salary=" + salary + '}';
    }
}
