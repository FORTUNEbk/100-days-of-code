import java.nio.file.*;

public class FilePathDetails {
    public static void main(String[] args) {
        Path filePath = Paths.get("myDirectory/renamedFile.txt");

        Path fileName = filePath.getFileName();
        System.out.println("File name: " + fileName);

        Path directory = filePath.getParent();
        System.out.println("Directory: " + directory);

        String fileNameStr = fileName.toString();
        String fileExtension = "";
        int lastDotIndex = fileNameStr.lastIndexOf('.');
        if (lastDotIndex != -1) {
            fileExtension = fileNameStr.substring(lastDotIndex + 1);
        }
        System.out.println("File extension: " + fileExtension);
    }
}
