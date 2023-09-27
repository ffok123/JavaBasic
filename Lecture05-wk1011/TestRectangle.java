public class TestRectangle {
	
	public static void main (String[] args) {
		
		try{
		Rectangle myRectangle = new Rectangle(5, 40, "white"); 
		
		System.out.println("The area of a rectangle with width " + 
		myRectangle.getWidth() + " and height " + 
		myRectangle.getHeight() + " is " +
		myRectangle.findArea());
		
		System.out.println("The Circumference of rectangle (myRectangle) : " +
		myRectangle.findCircumference());
		
		System.out.println("The color of rectangle (myRectangle) : " +
		myRectangle.getColor());
		
		System.out.println(myRectangle.getChar());
		System.out.println();
		
		Rectangle yourRectangle = new Rectangle(1.0, 3.5, "red");
		System.out.println("The area of a rectangle with width " + 
		yourRectangle.getWidth() + " and height " + 
		yourRectangle.getHeight() + " is " +
		yourRectangle.findArea());
		
		System.out.println("The Circumference of rectangle (myRectangle) : "+
		+ yourRectangle.findCircumference());
		
		System.out.println("The color of a rectangle (yourRectangle):" + 
		yourRectangle.getColor());
		
		//===================
		//modify by setting width
		yourRectangle.setWidth(-11);

		System.out.println("The area of a rectangle with width " + 
		yourRectangle.getWidth() + " and height " + 
		yourRectangle.getHeight() + " is " +
		yourRectangle.findArea());
		
		
		}catch (Exception ex) {
		
			System.err.println("You have enter something wrong in setWidth method");
			ex.printStackTrace();
		}
	
		//Modify
		
	}//end main
}//end class
