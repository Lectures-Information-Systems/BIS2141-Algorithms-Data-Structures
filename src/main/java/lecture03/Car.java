package lecture03;

/**
 *
 * @author Andreas Schneider
 */
public class Car
{

    private String model;
    private int year;

    public Car(String model, int year)
    {
        this.model = model;
        this.year = year;
    }

    public Car()
    {
        
    }

    public void displayInfo()
    {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}
