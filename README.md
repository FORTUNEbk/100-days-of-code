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

# Day 8
The Day8 class in the provided code is designed to perform three distinct operations based on user input: checking if a number is odd or even, finding the largest of three numbers, and determining if a given year is a leap year. The class utilizes the Scanner class from the java.util package to read user inputs from the console.
The main method is the entry point of the program. It starts by creating a Scanner object to capture user input and presents a menu to the user with three options: "Check Odd or Even," "Find Largest of Three Numbers," and "Check Leap Year." The user is prompted to enter their choice, which is then read as an integer. Based on the user’s choice, a corresponding method is invoked using a switch-case structure.
The checkOddEven method prompts the user to enter an integer and then determines if the number is odd or even. This is done by checking the remainder of the number when divided by 2 using the modulus operator (%). If the remainder is zero, the number is even; otherwise, it is odd. The result is printed to the console.
The findLargestOfThree method asks the user to input three double values. It then determines the largest of the three numbers using a series of conditional statements. The result is stored in a variable named largest, which is then printed out.
The checkLeapYear method prompts the user to enter a year. It checks if the year is a leap year using the standard leap year rules: a year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400. The result is printed to the console.

# Day 9
The program begins by importing the Scanner class from the java.util package to facilitate user input. The class Day9 contains the main method, which serves as the entry point for the program's execution.
Within the main method, a Scanner object named scanner is instantiated to read input from the user. The program then prompts the user to "Enter your percentage:" and reads the inputted integer value using the nextInt() method of the Scanner class. This integer, representing the percentage score, is stored in the variable percentage.
To determine the corresponding letter grade, the program first calculates the grade range by dividing the percentage by 10. This division simplifies the percentage into a more manageable range, allowing the switch statement to handle it effectively. The result of this division is stored in the variable gradeRange.
The switch statement evaluates the value of gradeRange and assigns a letter grade based on the case that matches the value. If gradeRange is 10 or 9, the letter grade 'A' is assigned. If it is 8, the grade 'B' is assigned. Similarly, if it is 7, 'C' is assigned, and if it is 6, 'D' is assigned. Any other value falls under the default case, assigning the grade 'F'.

# Day 10_1
The Day10_1 class is a Java program that calculates the sum of all integers from 1 to a user-provided number using three different loop constructs: a for loop, a while loop, and a do-while loop. It begins by importing the Scanner class to allow for user input. In the main method, a Scanner object named scanner is instantiated to read input from the console. The user is prompted to enter an integer, which is then stored in the variable n.
The program proceeds to calculate the sum of integers from 1 to n using a for loop. An integer variable sumFor is initialized to 0. The for loop iterates from 1 to n, adding each value of i to sumFor. After the loop completes, the result is printed to the console.
Next, the sum is calculated using a while loop. The variable sumWhile is initialized to 0, and the loop variable i is initialized to 1. The while loop continues to execute as long as i is less than or equal to n. Within the loop, i is added to sumWhile, and then i is incremented by 1. After exiting the loop, the result is printed to the console.

# Day 10_2
The Day10_2 class is a Java program designed to calculate the sum of all even integers from 1 to a user-provided number. The program begins by importing the Scanner class to facilitate user input. In the main method, a Scanner object named scanner is created to read input from the console. The user is prompted to enter an integer, which is stored in the variable number.
An integer variable sum is initialized to 0 to keep track of the cumulative sum of the even integers. The program then uses a for loop to iterate through all integers from 1 to the value of number. Within the loop, an if statement checks if the current integer i is odd by using the modulus operator (i % 2 != 0). If i is odd, the continue statement is executed, which skips the rest of the loop body and proceeds to the next iteration.
If i is even, the continue statement is bypassed, and the value of i is added to the sum variable. This process continues until the loop has iterated through all integers from 1 to number.
After the loop completes, the program prints the total sum of the even integers from 1 to the user-provided number. This final result is displayed to the console with a descriptive message.

# Day 10_3
The Day10_3 class is a Java program that demonstrates generating random numbers and checking conditions using a while loop. It begins by importing the Random class from the java.util package to facilitate the generation of random numbers. In the main method, a Random object named random is instantiated.
Inside the while loop, which runs indefinitely (while (true)), a random integer num is generated using the nextInt(100) + 1 method of the Random class. This generates a random integer between 1 and 100 inclusive and assigns it to num. The generated number num is then printed to the console using System.out.println("Generated number: " + num).
Following the print statement, an if statement checks if the generated number num is divisible by both 5 and 7. This is done using the condition num % 5 == 0 && num % 7 == 0. If this condition is true, indicating that num is divisible by both 5 and 7 without remainder, the program executes the statements within the if block.
Within the if block, it prints a message indicating that a number divisible by both 5 and 7 has been found, along with the value of num. After printing this message, the break statement is encountered, which terminates the while loop. This break statement exits the loop immediately upon finding a number that satisfies the condition, ensuring that the program does not continue generating numbers unnecessarily once the desired number is found.

# Day 11
The Day11 class in Java demonstrates various operations on strings using static methods. Each method encapsulates a specific string manipulation or utility function, and the main method showcases the usage of these methods through a series of examples.
The stringLength method takes a string as input and returns its length using the length() method. The stringConcatenation method concatenates two strings using the + operator and returns the result. The stringComparison method compares two strings for equality using the equals() method and returns a boolean indicating if they are the same.
The stringToUppercase method converts a string to uppercase using the toUpperCase() method, while the stringToLowercase method converts a string to lowercase using the toLowerCase() method. The stringTrimming method removes any leading and trailing whitespace from a string using the trim() method.
For substring extraction, the substringExtraction method takes a string and two integer indices, returning the substring from the start index to the end index using the substring() method. The stringSplitting method splits a string into an array of substrings based on a specified delimiter using the split() method.
The stringReversal method reverses a string by converting it to a StringBuilder, calling the reverse() method, and converting it back to a string. The stringSearching method checks if a substring exists within a string using the contains() method, returning a boolean result.
In the main method, various string operations are demonstrated. It starts by defining four strings: str1 (" Hello, World! "), str2 ("Java"), str3 ("hello"), and str4 ("HELLO"). The string length of str1 is printed, followed by the result of concatenating str1 and str2. The method then compares str1 with str2 and str3 with str4 (both converted to lowercase for case-insensitive comparison).
Next, the methods to convert str1 to uppercase and lowercase are demonstrated, followed by trimming the whitespace from str1. A substring of str1 from index 1 to 6 is extracted and printed. The string splitting functionality is demonstrated by splitting str1 using a comma delimiter, and the resulting substrings are printed.

# Day 12
Day12 that contains a main method. This method serves as the entry point of the program. Within the main method, two objects are created, one of the StringBuffer class and one of the StringBuilder class, both initialized with the string "Hello".
For the StringBuffer object, the append method is called twice: first to append a space character (" ") and then to append the string "World". The resulting concatenated string is then printed to the console with the label "StringBuffer: ".
Similarly, for the StringBuilder object, the append method is used twice in the same manner: first to append a space character and then to append the string "World". The concatenated string is then printed to the console with the label "StringBuilder: ".
This code demonstrates the usage of StringBuffer and StringBuilder for modifying strings in Java, highlighting their ability to efficiently handle string concatenations. The key difference is that StringBuffer is synchronized and thread-safe, making it suitable for use in multi-threaded environments, while StringBuilder is not synchronized and thus more efficient for use in single-threaded environments.

# Day 13_1
Inside the main method, an array of integers named numbers is initialized with the values {10, 20, 30, 40, 50}.
Next, an integer variable sum is initialized to 0. A for-each loop is used to iterate over each element in the numbers array. During each iteration, the current element (represented by the variable num) is added to sum, thus calculating the total sum of all elements in the array.
After the loop, a double variable average is calculated by dividing the sum by the length of the numbers array. To ensure the division is performed as floating-point division, sum is explicitly cast to double.
Finally, the average value is printed to the console using System.out.println, which outputs the message "The average is: " followed by the calculated average value.

# Day 13_2
It contains a main method that serves as the entry point of the Java application. Within the main method, an integer array named sourceArray is initialized with the values {10, 20, 30, 40, 50}. Following this, another integer array named destinationArray is declared with the same length as sourceArray.
The program then uses a for loop to iterate over each index of sourceArray. During each iteration, the value at the current index in sourceArray is copied to the corresponding index in destinationArray. This loop effectively duplicates the contents of sourceArray into destinationArray.
After copying the elements, the program prints "Destination array: " to the console. It then uses another for-each loop to iterate over each element in destinationArray, printing each element followed by a space. This results in the entire contents of destinationArray being displayed on a single line in the console.

# Day 14
 It contains a main method and several helper methods for array operations. The main method initializes a two-dimensional array array with predefined integer values and performs various operations on it.
First, the main method prints the original array to the console using the printArray method, which iterates through the array and prints its elements in a formatted manner. Then, it calls the maxInRows method to find the maximum values in each row of the array. This method iterates through each row, finds the maximum value in each row, and stores these values in a new array maxValues, which is then printed using the printArray method.
Next, the main method calls the maxInColumns method to find the maximum values in each column of the array. This method iterates through each column, finds the maximum value in each column, and stores these values in a new array maxValues, which is also printed using the printArray method.
After that, the main method calls the transpose method to transpose the original array. The transpose method swaps the rows and columns of the array, creating a new transposed array transposed, which is then printed using the printArray method.
The printArray method is overloaded to handle both one-dimensional and two-dimensional arrays. For two-dimensional arrays, it prints each element of each row followed by a space and a newline after each row. For one-dimensional arrays, it prints each element followed by a space and a newline at the end.

# Day 15
Day15, which contains a main method and a helper method for manipulating an ArrayList of strings representing the days of the week. The program performs several operations on this list, including sorting and removing specific elements.
First, the main method initializes an ArrayList named weekdays and populates it with the names of the days from Monday to Sunday. It then prints the original list to the console.
Next, the program sorts the weekdays list in increasing alphabetical order using the Collections.sort method, which sorts the elements in the list. The sorted list is then printed to the console.
Following this, the program sorts the weekdays list in decreasing alphabetical order by using Collections.sort in combination with Collections.reverseOrder. The Collections.reverseOrder method provides a comparator that sorts the elements in reverse order. The resulting list is printed to the console.
The program then declares a character variable removeChar with the value 'T'. This character is used to remove elements from the weekdays list that start with 'T'. The removeElementsStartingWith method is called with the weekdays list and the removeChar as arguments. This method uses the removeIf method along with a lambda expression (day -> day.charAt(0) == startChar) to remove any elements whose first character matches removeChar. Finally, the modified list is printed to the console.

