package lecture04;

/**
 * The LectureFour class demonstrates basic usage of the Calculator class.
 * <p>
 * It creates an instance of the Calculator class and performs example
 * calculations using both integer and double multiplication methods. It also
 * displays a default message using the Calculator's toString() method.
 * </p>
 *
 * <p>
 * This example is useful for learning how to create instances of classes and
 * call methods in Java.</p>
 *
 * @author Andreas R. Schneider
 */
public class LectureFour
{

    /**
     * The main method is the entry point of the Java application.
     *
     * <p>
     * In this method, we create a Calculator object and use it to perform
     * simple multiplication with both integer and double values. The results
     * are displayed using System.out.println.</p>
     *
     * @param args command-line arguments (not used in this example)
     */
    public static void main(String[] args)
    {
        // Creating an instance of the Calculator class
        Calculator myCalc = new Calculator();

        // Define a double variable for example calculations
        double myExample = 10;

        // Display the value of myExample
        System.out.println(myExample);

        // Perform multiplication using two integers
        System.out.println(myCalc.multiply(10, 10));

        // Perform multiplication using two double values
        System.out.println(myCalc.multiply(10.0, 10.0));

        // Display the default message from the Calculator's toString method
        System.out.println(myCalc.toString());
    }
}
