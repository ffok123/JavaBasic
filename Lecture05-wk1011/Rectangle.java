public class Rectangle {

	// instance variables
	private double width, height;
	private String color;
	char test;

	// Constructor
	public Rectangle(double width, double height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public double getWidth() {
		return width;
	}
	public char getChar() {
		return test;
	}
	
	public double getHeight() {
		return height;
	}
	
	public String getColor() {
		return color;
	}
	//=====================
	public void setWidth(double width) throws Exception {
		if (width<0) throw new Exception();
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	//=====================	
	
	public double findArea() {
		return width*height;
	}

	public double findCircumference(){
		return 2*(width+height);
	}

} //end main
	
