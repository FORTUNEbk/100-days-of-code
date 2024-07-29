import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileReading {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2); 

        executor.submit(() -> readFile("instructors.txt"));
        executor.submit(() -> readFile("students.txt"));

        executor.shutdown(); 
    }

    public static void readFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(fileName + ": " + line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file " + fileName + ": " + e.getMessage());
        }
    }
}
