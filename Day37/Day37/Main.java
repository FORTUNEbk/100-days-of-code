import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    
    public static class Instructor {
        private int id;
        private String firstName;
        private String lastName;
        private String qualification;
        private String department;
        private int experience;

        public Instructor() { } 

        public Instructor(int id, String firstName, String lastName, String qualification, String department, int experience) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.qualification = qualification;
            this.department = department;
            this.experience = experience;
        }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getFirstName() { return firstName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }
        public String getLastName() { return lastName; }
        public void setLastName(String lastName) { this.lastName = lastName; }
        public String getQualification() { return qualification; }
        public void setQualification(String qualification) { this.qualification = qualification; }
        public String getDepartment() { return department; }
        public void setDepartment(String department) { this.department = department; }
        public int getExperience() { return experience; }
        public void setExperience(int experience) { this.experience = experience; }

        @Override
        public String toString() {
            return id + " " + firstName + " " + lastName + " " + qualification + " " + department + " " + experience;
        }
    }

    public static void main(String[] args) {
        List<String[]> studentsDetails = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader("students.csv"))) {
            studentsDetails = reader.readAll();
            studentsDetails.sort(Comparator.comparing(line -> line[1])); 
        } catch (IOException | CsvException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }

        System.out.println("Sorted Student Details:");
        for (String[] student : studentsDetails) {
            System.out.println(String.join(", ", student));
        }

        Map<Integer, Instructor> instructors = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            CollectionType listType = mapper.getTypeFactory().constructCollectionType(List.class, Instructor.class);
            List<Instructor> instructorList = mapper.readValue(new File("instructors.json"), listType);
            for (Instructor instructor : instructorList) {
                instructors.put(instructor.getId(), instructor);
            }
        } catch (IOException e) {
            System.out.println("Error reading JSON file: " + e.getMessage());
        }

        System.out.println("\nSorted Instructor Details:");
        instructors.values().stream()
                .sorted(Comparator.comparing(Instructor::getId))
                .forEach(System.out::println);
    }
}
