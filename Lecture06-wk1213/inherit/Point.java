public class Point {
	private	int x;
	private int y;
	private static int count=0;

public Point(){
		this(0,0);
	}

public Point( int x, int y){
		this.x=x;
		this.y=y;
		count++;
	}

protected void finalize(){
		count--;
	}

public void setX( int x){
		this.x=x;
	}

	public int getX(){
		return x;
	}

public void setY( int y){
		this.y=y;
	}

	public  int getY(){
		return y;
	}

	public void print(){
		System.out.println("Point ["+x+", "+y+"]");
	}

public static int getCount(){
		return count;
	}

}
