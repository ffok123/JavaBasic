public class Circle extends Point{
	private static int count=0;
	private double radius;

   	public Circle(){
		this(0,0,0);
	}

    	public Circle( int x, int y, double radius){
		super(x, y);
		this.radius=radius;
	}

    	protected void finalize(){
		count--;
		super.finalize();
	}

    	public void setRadius(double radius){
		this.radius=radius;
	}

    	public double getRadius(){
		return radius;
	}


	public double getDiameter(){
		return radius*2;
	}
	
public void print(){
System.out.println("Circle center=["+getX()+", "+super.getY()+"], radius="+getRadius());
	}

   
}
