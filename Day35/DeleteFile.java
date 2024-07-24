import java.io.IOException;
import java.nio.file.*;

public class DeleteFile {
    public static void main(String[] args) {
        Path fileToDelete = Paths.get("myDirectory/renamedFile.txt");

        try {
            Files.delete(fileToDelete);
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
