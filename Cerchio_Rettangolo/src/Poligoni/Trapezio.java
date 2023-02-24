package Poligoni;
import java.lang.Math;

public class Trapezio 
{
    private double basem, baseM, height;
    
    //constructor
    public Trapezio(double bm, double bM, double h)
    {
        basem = bm;
        baseM = bM;
        height = h;
    }

    //method
    public double perimeter()
    {
        return (basem+baseM) + Math.sqrt((((baseM-basem)/2)*((baseM-basem)/2))+(height*height));
    }
    //
    public double area()
    {
        return (((basem+baseM)*height)/2);
    }

}