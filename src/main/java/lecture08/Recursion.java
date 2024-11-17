package lecture08;

/**
 * This class demonstrates recursive methods for solving common problems such as
 * factorial computation, Fibonacci sequence generation, and binary search. Each
 * method showcases the use of recursion in Java.
 *
 * @author Andreas R. Schneider
 */
public class Recursion
{

    /**
     * Computes the factorial of a non-negative integer using recursion.
     *
     * @param n the number for which the factorial is to be computed; must be
     * non-negative.
     * @return the factorial of the given number. If {@code n} is 0, the result
     * is 1.
     */
    public static int factorial(int n)
    {
        if (n == 0)
        {
            return 1; // Base case: 0! is defined as 1
        }
        return n * factorial(n - 1); // Recursive case: n * (n-1)!
    }

    /**
     * Computes the nth Fibonacci number using recursion.
     *
     * @param n the position of the Fibonacci sequence to compute; must be
     * non-negative.
     * @return the nth Fibonacci number. For {@code n <= 1}, the result is
     * {@code n}.
     */
    public static int fibonacci(int n)
    {
        if (n <= 1)
        {
            return n; // Base cases: F(0) = 0, F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case: F(n) = F(n-1) + F(n-2)
    }

    /**
     * Performs a binary search on a sorted array to find the index of a
     * specified key.
     *
     * @param arr the sorted array to search.
     * @param low the starting index of the search range.
     * @param high the ending index of the search range.
     * @param key the value to search for.
     * @return the index of the key if found; otherwise, {@code -1}.
     */
    public static int binarySearch(int[] arr, int low, int high, int key)
    {
        if (low > high)
        {
            return -1; // Base case: key is not present in the array
        }
        int mid = low + (high - low) / 2; // Avoids potential overflow in (low + high) / 2
        if (arr[mid] == key)
        {
            return mid; // Key found at index mid
        } else if (key < arr[mid])
        {
            return binarySearch(arr, low, mid - 1, key); // Search in the left half
        } else
        {
            return binarySearch(arr, mid + 1, high, key); // Search in the right half
        }
    }
}
