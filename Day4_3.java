import java.util.Scanner;

public class Day4_3{
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the length of the rectangle ");
        double length = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the width of the rectangle ");
        double width = Integer.valueOf(scanner.nextLine());

        double area = length * width;

        System.out.println ("The area of the rectangle is " + area );

        scanner.close();

    }
}