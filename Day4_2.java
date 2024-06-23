import java.util.Scanner;

public class Day4_2{
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle ");
        int length = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the width of the rectangle ");
        int width = Integer.valueOf(scanner.nextLine());

        int area = length * width;

        System.out.println ("The area of the rectangle is " + area );
        scanner.close();

    }
}