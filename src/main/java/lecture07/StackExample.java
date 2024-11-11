package lecture07;

import java.util.Stack;

/**
 * A simple example demonstrating the use of a stack in Java.
 *
 * <p>
 * This program shows basic stack operations such as push, pop, and peek, using
 * a stack of strings. Elements are added to the stack in a specific order, and
 * then removed to illustrate the Last-In-First-Out (LIFO) principle of
 * stacks.</p>
 *
 * @author Andreas R. Schneider
 */
public class StackExample
{

    /**
     * The main method demonstrating stack operations.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args)
    {
        // Create a stack to hold String elements
        Stack<String> stack = new Stack<>();

        // Push (add) elements onto the stack in the order they are given
        stack.push("First");  // Adds "First" to the stack
        stack.push("Second"); // Adds "Second" on top of "First"
        stack.push("Third");  // Adds "Third" on top of "Second"

        // Peek at the top element without removing it from the stack
        System.out.println("Top element: " + stack.peek());

        // Pop (remove) elements from the stack one by one, starting with the top element
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // After popping twice, "First" is now the top element in the stack
        // Peek again to see the current top element after the previous pops
        System.out.println("Current top element: " + stack.peek());
    }
}
