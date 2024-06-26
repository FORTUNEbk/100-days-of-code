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

# Day 5
It begins by prompting the user to enter their age, reading this input as a string and checking if it's empty to ensure valid data entry. If the input is empty, the program informs the user that a blank entry is not accepted and terminates gracefully. Upon receiving a valid age input, the program converts it to an integer and checks if it's less than 150. If the age is within a valid range, it prints a message stating the age. If the age is 150 or more, it outputs "Impossible" and exits.
After confirming a valid age, the program proceeds to increment the age by 1 for display purposes and prints this incremented value. It then resets the age back to its original value and calculates the factorial of the age using a loop. Additionally, it computes the sum of integers from 1 to the age and also calculates a subtraction value, which accumulates negative values due to its decrementing operation within the same loop.
Following these calculations, the program computes the average of the values from 1 to the age, ensuring accuracy by using a double type to account for decimal places in the division operation. It also checks if the age is an even number and prepares a corresponding text message for output.
Finally, the program prints the results of these calculations:
The factorial of the age.
The sum of integers up to the age.

# Day 6
First, it initializes a string strInt with the value "123" and converts it to an integer using Integer.parseInt(), storing the result in the variable intValue. This conversion is printed to the console. Next, a string strFloat with the value "123.45" is converted to a float using Float.parseFloat(), and the result is stored in the variable floatValue, which is then printed to the console.
Following these conversions, an integer number is initialized with the value 456. The program converts this integer to a string using two different methods. The first method, String.valueOf(), converts the integer to a string and stores the result in the variable strFromValueOf, which is printed to the console. The second method, Integer.toString(), also converts the integer to a string and stores the result in the variable strFromToString, which is similarly printed.

# Day 7
Initially, two double variables, num1 and num2, are declared and initialized with the values -5.4 and 3.7, respectively. The program then uses the Math.max() method to determine the maximum value between num1 and num2, storing the result in the variable max and printing it to the console. Similarly, the Math.min() method is used to find the minimum value between num1 and num2, with the result stored in min and printed.
The code proceeds to demonstrate the calculation of the square root of a number. A double variable number is initialized with the value 16.0, and the Math.sqrt() method is used to compute its square root, storing the result in the variable sqrt and printing it. The program then illustrates the use of Math.floor() and Math.ceil() methods on a double variable floatNum initialized with the value 5.67. These methods compute the largest integer less than or equal to floatNum and the smallest integer greater than or equal to floatNum, respectively. The results are stored in floor and ceil and printed to the console.

The cumulative subtraction of integers up to the age.
The calculated average with precision to two decimal places.
A message indicating if the age is an even number.
To ensure proper resource management, the program closes the Scanner object used for input after completing all calculations and outputs.


