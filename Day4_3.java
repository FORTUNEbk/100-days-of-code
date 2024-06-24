import java.util.Scanner;

public class Day4_3{
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the length of the rectangle ");
        double length = Double.valueOf(scanner.nextLine());

        System.out.println("Enter the width of the rectangle ");
        double width = Double.valueOf(scanner.nextLine());

        double area = length * width;

        String formattedArea = String.format("%.2f", area);

        System.out.println ("The area of the rectangle is " + formattedArea );

        scanner.close();

    }
}