package lecture02;

/**
 * This class demonstrates basic Java programming concepts such as printing 
 * values, variable declaration, arithmetic operations, and calculating revenue.
 * 
 * <p>The class includes an example of printing various types of data to the 
 * console, performing simple arithmetic, and calculating total revenue based 
 * on the number of students and a menu price.</p>
 * 
 * @author Andreas Schneider
 */
public class LectureTwo
{

    /**
     * The main method is the entry point of any Java application. It contains 
     * the code to be executed when the program starts.
     * 
     * @param args Command-line arguments passed as an array of String objects
     */
    public static void main(String[] args)
    {
        // Print a simple message to the console
        System.out.println("Hello World!");

        // Print the string "123" to the console
        System.out.println("123");

        // Print the integer value 123 to the console
        System.out.println(123);

        // Declare an integer variable 'numberOne' and assign it a value of 100
        int numberOne = 100;

        // Print the value of 'numberOne' (which is 100) to the console
        System.out.println(numberOne);
        
        // Subtract 10 from 'numberOne' and print the result
        numberOne = numberOne - 10;
        System.out.println(numberOne);

        // Declare an integer variable 'amountOfStudents' and assign it the value 200
        int amountOfStudents = 200;

        // Declare a double variable 'menuPrice' and assign it the value 4.35
        double menuPrice = 4.35;

        // Calculate the revenue by multiplying 'amountOfStudents' with 'menuPrice'
        // Store the result in the 'revenue' variable
        double revenue = amountOfStudents * menuPrice;

        // Print the calculated revenue to the console
        System.out.println(revenue);

        // Directly print the result of 'amountOfStudents' multiplied by 'menuPrice'
        System.out.println(amountOfStudents * menuPrice);
    }
}