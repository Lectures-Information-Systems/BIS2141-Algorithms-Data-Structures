package lecture07;

import java.util.LinkedList;
import java.util.Queue;

/**
 * CustomQueue is a generic queue class that demonstrates basic queue
 * operations: enqueue (add to queue), dequeue (remove from queue), peek (view
 * front of queue), and isEmpty (check if queue is empty).
 *
 * @param <T> the type of elements in this queue
 */
public class CustomQueue<T>
{

    // This internal Queue variable uses Java's LinkedList to store elements.
    private Queue<T> queue;

    /**
     * Constructor for CustomQueue class. Initializes an empty queue.
     */
    public CustomQueue()
    {
        queue = new LinkedList<>(); // LinkedList used because it implements Queue interface
    }

    /**
     * Adds an element to the end of the queue.
     *
     * @param element the element to be added
     */
    public void enqueue(T element)
    {
        queue.add(element); // add() adds to the end of the queue
    }

    /**
     * Removes and returns the element at the front of the queue. If the queue
     * is empty, it prints a message and returns null.
     *
     * @return the removed front element or null if queue is empty
     */
    public T dequeue()
    {
        if (isEmpty())
        { // Check if queue has no elements
            System.out.println("Queue is empty."); // Notify user of empty queue
            return null; // Return null since there's no element to remove
        }
        return queue.poll(); // poll() removes the front element and returns it
    }

    /**
     * Returns the front element of the queue without removing it. If the queue
     * is empty, it prints a message and returns null.
     *
     * @return the front element or null if queue is empty
     */
    public T peek()
    {
        if (isEmpty())
        { // Check if queue is empty before peeking
            System.out.println("Queue is empty."); // Inform user queue is empty
            return null; // Return null as there is no front element
        }
        return queue.peek(); // peek() returns the front element without removal
    }

    /**
     * Checks if the queue has no elements.
     *
     * @return true if the queue is empty; false otherwise
     */
    public boolean isEmpty()
    {
        return queue.isEmpty(); // isEmpty() returns true if there are no elements in queue
    }

    /**
     * Main method to demonstrate the CustomQueue operations.
     */
    public static void main(String[] args)
    {
        CustomQueue<Integer> myQueue = new CustomQueue<>(); // Create a queue of Integers

        // Adding elements to the queue
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        // Viewing the front element
        System.out.println("Peek: " + myQueue.peek()); // Expected output: 1

        // Removing elements from the queue
        System.out.println("Dequeue: " + myQueue.dequeue()); // Expected output: 1
        System.out.println("Is queue empty? " + myQueue.isEmpty()); // Expected output: false

        // Continue dequeuing until empty
        System.out.println("Dequeue: " + myQueue.dequeue()); // Expected output: 2
        System.out.println("Dequeue: " + myQueue.dequeue()); // Expected output: 3
        System.out.println("Is queue empty? " + myQueue.isEmpty()); // Expected output: true
    }
}
