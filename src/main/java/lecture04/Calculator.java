package lecture04;

/**
 * The Calculator class provides basic methods for multiplication of integers
 * and doubles. It also includes simple methods to return string representations
 * of objects.
 *
 * <p>
 * This example class is useful for learning method overloading and basic
 * object-oriented programming concepts in Java.</p>
 *
 * @author Andreas R. Schneider
 */
public class Calculator
{

    /**
     * Multiplies two integer values.
     *
     * @param numberOne the first integer value to multiply
     * @param numberTwo the second integer value to multiply
     * @return the product of the two integer values
     */
    public int multiply(int numberOne, int numberTwo)
    {
        return numberOne * numberTwo;
    }

    /**
     * Multiplies two double values.
     *
     * @param numberOne the first double value to multiply
     * @param numberTwo the second double value to multiply
     * @return the product of the two double values
     */
    public double multiply(double numberOne, double numberTwo)
    {
        return numberOne * numberTwo;
    }

    /**
     * Returns a default string representation of the Calculator.
     *
     * <p>
     * This method is overridden from the Object class and will be called
     * automatically if an object of the Calculator class is printed without
     * specifying a format.</p>
     *
     * @return the default string message for the Calculator
     */
    @Override
    public String toString()
    {
        return "Hello Calculator";
    }

    /**
     * Returns a custom string message passed as an argument.
     *
     * @param input the custom message to return as a string
     * @return the custom message passed in the input parameter
     */
    public String toString(String input)
    {
        return input;
    }
}
