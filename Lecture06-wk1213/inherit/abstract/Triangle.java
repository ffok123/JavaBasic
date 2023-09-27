class Triangle extends GeometricObject
{
  double side1, side2, side3;

  // Constructor
  public Triangle(double side1, double side2, double side3)
  {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  // Implement the abstract method findArea in GeometricObject
  public double findArea()
  {
    double s = (side1 + side2 + side3)/2;
    return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
  }

  // Implement the abstract method findCircumference in
  // GeometricObject
  public double findPerimeter()
  {
    return side1 + side2 + side3;
  }
}

