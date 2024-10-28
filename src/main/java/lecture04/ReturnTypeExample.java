package lecture04;

/**
 * The ReturnTypeExample class demonstrates different return types in Java
 * methods.
 * <p>
 * This class includes a method that returns an integer sum and another method
 * that displays a message without returning any value. It highlights how
 * different return types are used in Java methods based on their purpose.
 * </p>
 *
 * <p>
 * This example helps beginners understand when and why to use specific return
 * types.</p>
 *
 * @author Andreas R. Schneider
 */
public class ReturnTypeExample
{

    /**
     * Calculates the sum of two integer values.
     *
     * @param a the first integer to add
     * @param b the second integer to add
     * @return the sum of the two integers as an int
     */
    public int getSum(int a, int b)
    {
        return a + b;
    }

    /**
     * Displays a simple greeting message to the console.
     *
     * <p>
     * This method demonstrates a void return type, which means it performs an
     * action (displaying a message) but does not return any value.</p>
     */
    public void displayMessage()
    {
        System.out.println("Hello!");
    }

}
