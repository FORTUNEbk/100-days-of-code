import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStudents {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            List<Student> students = br.lines()
                    .skip(1)
                    .map(l -> l.split(csvSplitBy))
                    .map(data -> new Student(data[0], Integer.parseInt(data[1])))
                    .filter(student -> student.getGrade() > 3)
                    .collect(Collectors.toList());

            students.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class Student {
        private String name;
        private int grade;

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        public int getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', grade=" + grade + "}";
        }
    }
}
