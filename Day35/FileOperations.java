import java.io.IOException;
import java.nio.file.*;

public class FileOperations {
    public static void main(String[] args) {
        Path dir = Paths.get("myDirectory");
        Path file = dir.resolve("myFile.txt");

        try {
            Files.createDirectories(dir);

            Files.createFile(file);

            System.out.println("Directory and file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
