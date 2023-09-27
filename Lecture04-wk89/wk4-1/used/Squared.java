public class Squared {

	public static void main (String args[]) {
	int sq_i;
	System.out.println("\ti\ti sq.");
	System.out.println("\t-\t-----");
	for (int i = 1; i <= 10; i++) {
		sq_i = square(i);
		System.out.println("\t" + i + "\t" + sq_i); 
		}
	}

	//Method to calculate the square of an integer
	public static int square(int y) {
		return(y * y);
	}
}
