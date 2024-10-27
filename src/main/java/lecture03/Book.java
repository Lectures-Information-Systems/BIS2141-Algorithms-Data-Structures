package lecture03;

/**
 *
 * @author andreas
 */
public class Book
{
    private String title;
    private String author;
    private double price;
    
    private static int amountOfBooks;
    
    public Book(String title, String author, double price)
    {
        // parameterized constructor
        this.title = title;
        this.author = author;
        this.price = price;
        
        // add one to the counter
        amountOfBooks++;    // same like: amountOfBooks = amountOfBooks + 1;
    }
    
    public Book()
    {
        // default constructor
        
        // add one to the counter
        amountOfBooks++;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String input)
    {
        this.title = input;
    }
    
    public void displayDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price + " €");
    }
    
    public static int getAmountOfBooks()
    {
        return amountOfBooks;
    }
}
