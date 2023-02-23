import Cerchio.*;
import Rettangolo.*;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        //consctruct two objects giving directly attributes
        Cerchio ball = new Cerchio(10);
        Rettangolo book = new Rettangolo(10, 20);

        //printing out circumference and area of the circle
        System.out.println("\n\nCircle\n-----------------------");
        System.out.println("Circumference: " + Math.round(ball.circumference()));
        System.out.println("Area: " + Math.round(ball.area()));
        
        //printing out perimeter and area of the rectangle
        System.out.println("\n\nRectangle\n-----------------------");
        System.out.println("Perimeter: " + Math.round(book.perimeter()));
        System.out.println("Area: " + Math.round(book.area()));
    }
}
