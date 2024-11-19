package lecture09;

/**
 * Represents a single node in a Binary Search Tree (BST). Each node contains a
 * key and references to its left and right children.
 *
 * Author: Andreas R. Schneider Date: 2024
 */
public class Node
{

    int key; // The key stored in this node
    Node left, right; // References to the left and right children

    /**
     * Constructor to create a new node with a given key.
     *
     * @param key The value to be stored in the node.
     */
    public Node(int key)
    {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
