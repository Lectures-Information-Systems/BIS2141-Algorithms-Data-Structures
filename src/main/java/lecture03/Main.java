package lecture03;

/**
 *
 * @author Andreas Schneider
 */
public class Main
{

    public static void main(String[] args)
    {
        // At this point we should use our Book Class
        Book firstBook = new Book();
        System.out.println(firstBook);
        
        Book secondBook = new Book("Effective Java", "Bloch, Joshua", 38.49);
        System.out.println(secondBook);

        // Change Title of Book
        secondBook.setTitle("Effective Java - Third Edition");
        
        // Print value of Title
        System.out.println(secondBook.getTitle());
        
        // Print Details
        firstBook.displayDetails();
        secondBook.displayDetails();
        
        // New Book
        Book thirdBook = new Book();
        
        // How many books do we have?
        int counter = Book.getAmountOfBooks();
        System.out.println("Amount of Books: " + counter);
    }
}
