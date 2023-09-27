// Program to greet audience
public class SimpleCar {

	static String licenseNumber="BK6543";
	static double gas=300.5;

	public static void main (String args[]) {
	
	
	displayMessage();
	getLicenseNumber();
	getGas();
	
	}

	public static void displayMessage() {
		System.out.println("Welcome to my Second Program");
	}

	public static void getLicenseNumber() {
		System.out.println("License No is " + licenseNumber);
	}

	public static void getGas() {
		System.out.println("Gas Amount is " + gas);
	}
}
