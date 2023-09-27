public class PointCircleTest {

    public static void main(String args[]){
		Point p1=new Point(10,10);
		Point p2=p1;
		Circle c1=new Circle(20,20,5);

		p1.print();
		p2.print();
		c1.print();


		System.out.println("A1 = "+Point.getCount());
		System.out.println("A2 = "+Circle.getCount());

		p1=null;
		System.gc();
		System.out.println("B1 = "+Point.getCount());
		System.out.println("B2 = "+Circle.getCount());

		p2=null;
		System.gc();
		System.out.println("C1 = "+Point.getCount());
		System.out.println("C2 = "+Circle.getCount());

		c1=null;
		System.gc();
		System.out.println("D1 = "+Point.getCount());
		System.out.println("D2 = "+Circle.getCount());
	}
}
