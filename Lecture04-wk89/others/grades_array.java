//Program to store 10 grades
import java.io.*;
public class grades_array {

	static int	SID[] = new int[10];		// Student IDs
	static float	grades[] = new float[10];	// grades

	public static void main (String args[]) throws IOException {
	// Set up input reader
	BufferedReader input;
	input = new BufferedReader(new InputStreamReader(System.in));
	
	// Input storage
	int SID_in; float grade_in;
	
	for (int i=0; i<10; i++) {
		System.out.print("\nEnter student id " + (i+1) + ":\t");
		SID_in = Integer.parseInt(input.readLine());
		System.out.print("Enter student grade " + (i+1) + ":\t");
		grade_in = (new Float(input.readLine())).floatValue();

		SID[i] = SID_in;
		grades[i] = grade_in;
	} // for

	// Now print the grades for verification
	System.out.println("\nThese are the grades you entered:");

	for (int i=0; i<10; i++) {
		System.out.println("Student ID: "+SID[i]+"\tgrade: "+grades[i]);
	} // for

	} // main
} // class