# Day 1
This code is a basic example of a Java program, demonstrating the fundamental structure of a Java class and the use of the System.out.println method to print text to the console. This type of program is commonly used as an introductory example for learning Java programming, often referred to as the "Hello World" program.

# Day 2
Within the main method, three variables are declared and initialized with specific values: an integer num set to 21, a double num2 set to 30.0, and a string text set to "Hello". The program then uses the System.out.println method to print these values to the console, each preceded by a descriptive label. Specifically, it prints "Integer: 21" for the integer, "Double: 30.0" for the double, and "String: Hello" for the string. This code demonstrates basic variable declaration, initialization, and output in Java, illustrating how different data types can be used and displayed in a straightforward manner.

# Day 3
It creates an instance of the Scanner class to read input from the standard input stream (typically the keyboard).
It prompts the user to input a string, reads the input using scanner.nextLine(), and stores it in the variable text.
It prompts the user to input an integer, reads the input as a string, converts it to an integer using Integer.valueOf(scanner.nextLine()), and stores it in the variable number.
It prompts the user to input a double, reads the input as a string, converts it to a double using Double.valueOf(scanner.nextLine()), and stores it in the variable decimal.
It prompts the user to input a boolean, reads the input as a string, converts it to a boolean using Boolean.valueOf(scanner.nextLine()), and stores it in the variable value.
It then prints each of the captured inputs back to the console with descriptive messages.
Finally, it closes the Scanner object to release the associated resources.


# Day 4_1
Inside the main method, two integer variables, num1 and num2, are declared and initialized with the values 225 and 384, respectively.
The program then performs four basic arithmetic operations using these two variables. It calculates the sum, difference, product, and quotient of num1 and num2. The results of these calculations are stored in separate variables: sum, subtraction, multiplication, and division. Note that the division operation explicitly casts one of the integers (num1) to a double to ensure that the result is a double and not an integer. This allows for decimal places in the division result, providing a more accurate quotient.

# Day 4_2
Inside this class, the main method is defined, which serves as the entry point of the program. When the program runs, it first creates a Scanner object named scanner to read input from the standard input stream, typically the keyboard. The program prompts the user to enter the length of the rectangle with a message printed to the console. It then reads the user's input as a string, converts this string to an integer using Integer.valueOf, and assigns the resulting integer value to the variable length. A similar process is followed to prompt the user for the width of the rectangle: the program prints a message, reads the input, converts it to an integer, and stores it in the variable width.
With both the length and width values obtained, the program calculates the area of the rectangle by multiplying these two values. The calculated area is stored in the variable area. The program then prints the area to the console, providing a message that indicates the value being displayed.

# Day 4_3
The program prompts the user to enter the length of the rectangle by printing a message to the console. It then reads the user’s input as a string, converts this string to a double using Double.valueOf, and stores the resulting value in the variable length. This allows the program to handle decimal values, accommodating more precise measurements.
The program repeats the same process to obtain the width of the rectangle: it prompts the user, reads the input, converts it to a double, and stores it in the variable width. With both the length and width captured as decimal numbers, the program calculates the area of the rectangle by multiplying these two values. The result, stored in the variable area, is also a double, ensuring that the calculation can handle and maintain decimal precision.
Finally, the program prints the calculated area to the console with a message indicating the result. The use of double data type throughout the program allows it to handle decimal inputs and outputs, making it suitable for applications requiring precision.


