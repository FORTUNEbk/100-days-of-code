package Day33;

public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Jeff bezos", 12345, 75000.0);
        Student student = new Student("Jane njuguna", 67890, 3.9);

        SerializeDemo.serializeObject(instructor, "instructor.ser");
        SerializeDemo.serializeObject(student, "student.ser");

        Instructor deserializedInstructor = (Instructor) DeserializeDemo.deserializeObject("instructor.ser");
        Student deserializedStudent = (Student) DeserializeDemo.deserializeObject("student.ser");

        System.out.println("Deserialized Instructor: " + deserializedInstructor);
        System.out.println("Deserialized Student: " + deserializedStudent);
    }
}

