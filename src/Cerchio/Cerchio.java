package Cerchio;

public class Cerchio
{
    private double radius;

    //costrunctor
    public Cerchio(double r)
    {
        radius = r;
    };

    //methods
    public double circumference()
    {
        return (2 * (3.14 * radius));
    }
    //
    public double area()
    {
        return (6.28 * (radius * radius));
    }
}