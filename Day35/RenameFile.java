import java.io.IOException;
import java.nio.file.*;

public class RenameFile {
    public static void main(String[] args) {
        Path oldFile = Paths.get("myDirectory/myFile.txt");
        Path newFile = Paths.get("myDirectory/renamedFile.txt");

        try {
            Files.move(oldFile, newFile);
            System.out.println("File renamed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
