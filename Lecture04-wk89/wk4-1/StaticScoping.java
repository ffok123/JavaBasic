// A scoping example
public class StaticScoping {
	static int x = 1;	// static variable

	public static void main (String args[]) { //static method
		int x = 5;	// local (automatic) variable
		System.out.println("Local x in main is " + x);

		a();	// a has automatic local x
		b();	// b uses static variable x
		a();	// a reset automatic local x
		b();	// static variable x retains its value
		
		System.out.println("\nLocal x in main is " + x);
	}

	static void a() { // static method
		int x = 25;	// initialized each time a is called
		System.out.println("\nLocal x in a is " + x +
					" after entering a");
		++x;
		System.out.println("Local x in a is " + x +
					" before exiting a");
	}
	/*public void a() { // static method
		int x = 25;	// initialized each time a is called
		System.out.println("\nLocal x in a is " + x +
					" after entering a");
		++x;
		System.out.println("Local x in a is " + x +
					" before exiting a");
	}*/

	static void b() { // static method
		System.out.println("\nGlobal variable x is " + x +
					" on entering b");
		x *= 10;
		System.out.println("Global variable x is " + x +
					" on entering b");
	}
}
