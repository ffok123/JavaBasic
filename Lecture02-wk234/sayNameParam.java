// Program to greet audience
public class sayNameParam {

	public static void main (String args[]) {
	String myName = args[0];
	sayHello();
	sayName(myName);
	sayGoodbye();
	}

	public static void sayHello() {
		System.out.println("Hello!");
	}

	public static void sayName(String aName) {
		System.out.println("My name is " + aName + ".");
	}

	public static void sayGoodbye() {
		System.out.println("Goodbye.");
	}
}

