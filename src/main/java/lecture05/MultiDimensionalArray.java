package lecture05;

/**
 * This class demonstrates working with multi-dimensional (2D) arrays in Java,
 * including accessing elements and traversing the array.
 *
 * @author Andreas R. Schneider
 */
public class MultiDimensionalArray
{

    /**
     * The main method is the entry point of the program, demonstrating how to
     * initialise, access, and traverse a 2D array.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        // Declare and initialise a 2D array (matrix) with specified values
        int[][] matrix =
        {
            {
                1, 2, 3
            },
            {
                4, 5, 6
            },
            {
                7, 8, 9
            }
        };

        // Access a specific element in the matrix
        // Access element in the 2nd row, 3rd column
        int element = matrix[1][2];
        System.out.println("Element at (1, 2): " + element);

        // Traverse and print all elements in the matrix
        printMatrix(matrix);
    }

    /**
     * Prints all elements of a 2D integer array (matrix) in a grid format.
     *
     * @param matrix The 2D integer array to print
     */
    private static void printMatrix(int[][] matrix)
    {
        // Loop through each row in the matrix
        for (int[] row : matrix)
        {
            // Loop through each element in the row and print it
            for (int value : row)
            {
                System.out.print(value + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
