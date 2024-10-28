package lecture04;

/**
 * The OverloadingExample class demonstrates method overloading in Java.
 * <p>
 * This class includes two versions of the add method: one that adds integers
 * and another that adds doubles. Method overloading allows for multiple methods
 * with the same name but different parameter types or counts within a single
 * class.
 * </p>
 *
 * <p>
 * This example helps beginners understand the concept of method overloading and
 * how Java determines which method to use based on the argument types.</p>
 *
 * @author Andreas R. Schneider
 */
public class OverloadingExample
{

    /**
     * Adds two integer values.
     *
     * @param a the first integer to add
     * @param b the second integer to add
     * @return the sum of the two integers
     */
    public int add(int a, int b)
    {
        return a + b;
    }

    /**
     * Adds two double values.
     *
     * @param a the first double to add
     * @param b the second double to add
     * @return the sum of the two double values
     */
    public double add(double a, double b)
    {
        return a + b;
    }

}
