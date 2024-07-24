import java.nio.file.*;

public class CheckFileExists {
    public static void main(String[] args) {
        Path fileToCheck = Paths.get("myDirectory/renamedFile.txt");

        if (Files.exists(fileToCheck)) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
