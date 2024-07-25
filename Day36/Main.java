package Day36;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("input.txt"))) {
            System.out.println("Reading from input.txt using Paths.get and Scanner:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading input.txt using Paths.get: " + e.getMessage());
        }

        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            System.out.println("\nReading from input.txt using File and Scanner:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();

            if (file.exists()) {
                System.out.println("File path: " + file.getAbsolutePath());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        }

        try (FileReader fileReader = new FileReader("input.txt");
             Scanner scanner = new Scanner(fileReader)) {

            System.out.println("\nReading from input.txt using FileReader and Scanner:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading input.txt using FileReader: " + e.getMessage());
        }

        try (FileWriter fileWriter = new FileWriter("output.txt")) {
            fileWriter.write("This is a new line of text.\n");
            fileWriter.write("Here is another line of text.");
            System.out.println("\nData written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to output.txt: " + e.getMessage());
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output_buffered.txt"))) {
            bufferedWriter.write("BufferedWriter example.\n");
            bufferedWriter.write("Writing multiple lines of text.");
            System.out.println("\nData written to output_buffered.txt successfully using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("Error writing to output_buffered.txt: " + e.getMessage());
        }
    }
}
