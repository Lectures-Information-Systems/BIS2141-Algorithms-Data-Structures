package lecture05;

/**
 * This class demonstrates examples of working with arrays in Java, including
 * initialising, printing, and using 2D arrays.
 *
 * @author Andreas R. Schneider
 */
public class ArrayExample
{

    /**
     * The main method is the entry point of the program, demonstrating how to
     * initialise and use arrays.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        // Initialising an array with specific values
        int[] numbers =
        {
            1, 2, 3, 4, 5
        };
        printArray(numbers);

        // Creating an array with a specified size; default values will be 0 for integers
        int size = 5;
        int[] newArray = new int[size];
        printArray(newArray);

        // Creating an array of Student objects with initial values
        Student[] students =
        {
            new Student(300000, "Smith", "Alice"),
            new Student(300001, "Doe", "John"),
            new Student(300002, "Jackson", "Tom")
        };
        printStudents(students);

        // Creating and initialising a 2D array (matrix)
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
        printMatrix(matrix);
    }

    /**
     * Prints all elements of an integer array, each on a new line.
     *
     * @param array The integer array to print
     */
    private static void printArray(int[] array)
    {
        // Loop through each element in the array and print it
        for (int value : array)
        {
            System.out.println(value);
        }
    }

    /**
     * Prints all elements of a Student array, each Student on a new line.
     *
     * @param students The array of Student objects to print
     */
    private static void printStudents(Student[] students)
    {
        // Loop through each Student object in the array and print it
        for (Student student : students)
        {
            System.out.println(student);
        }
    }

    /**
     * Prints a 2D integer array (matrix) in a grid format.
     *
     * @param matrix The 2D integer array to print
     */
    private static void printMatrix(int[][] matrix)
    {
        // Loop through each row of the matrix
        for (int[] row : matrix)
        {
            // Loop through each element in the row and print it, separated by spaces
            for (int value : row)
            {
                System.out.print(value + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
