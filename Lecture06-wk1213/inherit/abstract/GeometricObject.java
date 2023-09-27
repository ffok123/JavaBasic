// GeometricObject.java: The abstract GeometricObject class
public abstract class GeometricObject
{
  protected String color;
  protected double weight;

  // Default construct
  public GeometricObject()
  {
    color = "white";
    weight = 1.0;
  }
  // Construct a geometric object
  public GeometricObject(String c, double w)
  {
    color = c;
    weight = w;
  }
  // Getter method for color
  public String getColor()
  {
    return color;
  }
  // Getter method for weight
  public double getWeight()
  {
    return weight;
  }
  // Abstract method
  public abstract double findArea();

  // Abstract method
  public abstract double findPerimeter();
}

