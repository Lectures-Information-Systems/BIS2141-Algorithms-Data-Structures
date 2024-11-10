package lecture05;

import java.util.Arrays;

/**
 * This class demonstrates basic operations on arrays in Java, including
 * traversal, sorting, and searching.
 *
 * @author Andreas R. Schneider
 */
public class ArrayOperations
{

    /**
     * The main method is the entry point of the program, showcasing various
     * array operations.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        // Initialising an array with specific values
        int[] numbers =
        {
            6, 19, 44, 42, 10, 20, 1
        };

        // Traversing and printing the array
        traverseArray(numbers);

        // Sorting the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted Array:");
        traverseArray(numbers);

        // Searching for an element in the sorted array
        int index = Arrays.binarySearch(numbers, 20);

        // Checking if the element was found and printing the result
        if (index >= 0)
        {
            System.out.println("Element found at index: " + index);
        } else
        {
            System.out.println("Element not found");
        }
    }

    /**
     * Prints all elements of an integer array in a single line, separated by
     * spaces.
     *
     * @param array The integer array to traverse and print
     */
    private static void traverseArray(int[] array)
    {
        // Loop through each element in the array and print it on the same line
        for (int value : array)
        {
            System.out.print(value + " ");
        }
        // Move to the next line after printing all elements
        System.out.println();
    }
}
