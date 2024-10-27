package lecture03;

/**
 *
 * @author Andreas Schneider
 */
public class Circle
{

    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }
}
