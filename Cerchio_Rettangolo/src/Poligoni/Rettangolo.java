package Poligoni;

public class Rettangolo 
{
    private double base, height;

    //contructor
    public Rettangolo(double b, double h)
    {
	    base = b; 
	    height = h; 
    }

    //methods
    public double perimeter() 
    {
	    return 2 * (base + height);
    }

    public double area()
    {
	    return base * height;
    }
}