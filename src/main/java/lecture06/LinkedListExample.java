package lecture06;

import java.util.LinkedList;

/**
 * This class demonstrates usage of a LinkedList in Java.
 * <p>
 * Note: Insertion and deletion are achieved through the standard methods
 * provided by the LinkedList class in Java.
 * </p>
 *
 * @author Andreas R. Schneider
 */
public class LinkedListExample
{

    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        // Inserting elements using add method
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Linked List after inserting elements:");
        printList(list); // Output: 10 -> 20 -> 30 -> 40

        // Deleting an element using remove method
        list.remove(Integer.valueOf(20));

        System.out.println("Linked List after deleting element 20:");
        printList(list); // Output: 10 -> 30 -> 40

        // Traversing the list
        System.out.println("Traversing the Linked List:");
        printList(list); // Output: 10 -> 30 -> 40
    }

    /**
     * Prints all elements in the LinkedList.
     *
     * @param list the LinkedList to be printed
     */
    public static void printList(LinkedList<Integer> list)
    {
        for (Integer element : list)
        {
            System.out.print(element + " -> ");
        }
        System.out.println("null");
    }
}
