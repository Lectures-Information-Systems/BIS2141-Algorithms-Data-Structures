package lecture04;

/**
 * The Person class demonstrates the concept of method overriding in Java.
 * <p>
 * This class contains basic attributes for a person, such as their name and
 * age, and provides a custom implementation of the toString method, which
 * overrides the default toString method from the Object class.
 * </p>
 *
 * <p>
 * This example helps beginners understand how to override a method and provide
 * a custom output format when printing objects.</p>
 *
 * @author Andreas R. Schneider
 */
public class Person
{

    // Private fields for the name and age of the person
    private String name;
    private int age;

    /**
     * Constructor to initialise a new Person object with a name and age.
     *
     * @param name the name of the person
     * @param age the age of the person
     */
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    /**
     * Overrides the default toString method to provide a custom output for
     * Person objects.
     *
     * <p>
     * When a Person object is printed, this method returns a string containing
     * the person's name and age in a formatted way.</p>
     *
     * @return a string representation of the Person object in the format
     * "Person{name='name', age=age}"
     */
    @Override
    public String toString()
    {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
