class Rectangle  {
    private double length;     
    private double width;
    
    public Rectangle (double l, double w) {  
        length = l;
        width = w;
    } // Rectangle() constructor

    public double calculateArea() 
   {  
          return length * width;
    } // end calculateArea()
    
} // end class Rectangle

class Square extends Rectangle {
    
  public Square (double side) {
      super(side, side); // Superconstructor
  }
} // end class Square

public class TestSquare
{
    public static void main(String argv[])
    {
     	  
     	  Rectangle r1 = new Square ( 100 );
        Rectangle r2 = new Rectangle(10,43);
        System.out.println( "square's area is " + r1.calculateArea() );
        System.out.println( "Rectangle's area is " + r2.calculateArea() );
    }
} // end class TestSquare
