package lecture09;

/**
 * Implementation of a Binary Search Tree (BST). This class provides public
 * methods to insert, search, and traverse nodes in a BST.
 *
 * @author: Andreas R. Schneider
 */
public class BinarySearchTree
{

    private Node root; // The root of the BST

    /**
     * Default constructor to initialise an empty BST.
     */
    public BinarySearchTree()
    {
        root = null;
    }

    /**
     * Inserts a key into the BST.
     *
     * @param key The value to be inserted into the tree.
     */
    public void insert(int key)
    {
        root = insertRec(root, key);
    }

    /**
     * Recursively inserts a key into the BST.
     *
     * @param root The current node in the tree.
     * @param key The value to be inserted.
     * @return The updated root node after insertion.
     */
    private Node insertRec(Node root, int key)
    {
        if (root == null)
        {
            return new Node(key);
        }
        if (key < root.key)
        {
            root.left = insertRec(root.left, key);
        } else if (key > root.key)
        {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    /**
     * Searches for a key in the BST.
     *
     * @param key The value to search for.
     * @return True if the key is found, otherwise false.
     */
    public boolean search(int key)
    {
        return searchRec(root, key);
    }

    /**
     * Recursively searches for a key in the BST.
     *
     * @param root The current node in the tree.
     * @param key The value to search for.
     * @return True if the key is found, otherwise false.
     */
    private boolean searchRec(Node root, int key)
    {
        if (root == null)
        {
            return false;
        }
        if (root.key == key)
        {
            return true;
        }
        if (key < root.key)
        {
            return searchRec(root.left, key);
        }
        return searchRec(root.right, key);
    }

    /**
     * Performs an in-order traversal of the BST. Traverses nodes in the order:
     * Left -> Root -> Right.
     */
    public void inorder()
    {
        inorderRec(root);
    }

    /**
     * Recursively performs an in-order traversal.
     *
     * @param root The current node in the tree.
     */
    private void inorderRec(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    /**
     * Performs a pre-order traversal of the BST. Traverses nodes in the order:
     * Root -> Left -> Right.
     */
    public void preorder()
    {
        preorderRec(root);
    }

    /**
     * Recursively performs a pre-order traversal.
     *
     * @param root The current node in the tree.
     */
    private void preorderRec(Node root)
    {
        if (root != null)
        {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    /**
     * Performs a post-order traversal of the BST. Traverses nodes in the order:
     * Left -> Right -> Root.
     */
    public void postorder()
    {
        postorderRec(root);
    }

    /**
     * Recursively performs a post-order traversal.
     *
     * @param root The current node in the tree.
     */
    private void postorderRec(Node root)
    {
        if (root != null)
        {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    /**
     * Main method to demonstrate the functionality of the BST. It inserts keys,
     * performs traversals, and searches for specific keys.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Demonstrate tree traversals
        System.out.println("In-order traversal:");
        bst.inorder(); // Expected: 20 30 40 50 60 70 80
        System.out.println("\nPre-order traversal:");
        bst.preorder(); // Expected: 50 30 20 40 70 60 80
        System.out.println("\nPost-order traversal:");
        bst.postorder(); // Expected: 20 40 30 60 80 70 50

        // Demonstrate search
        System.out.println("\nSearch 40: " + bst.search(40)); // Expected: true
        System.out.println("Search 100: " + bst.search(100)); // Expected: false
    }
}
