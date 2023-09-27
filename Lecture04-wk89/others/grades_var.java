//Program to store 10 grades
import java.io.*;
public class grades_var {

	// Student Ids
	static int	SID0, SID1, SID2, SID3, SID4, 
			SID5, SID6, SID7, SID8, SID9; 
	// Student grades
	static float	grade0, grade1, grade2, grade3, grade4,
			grade5, grade6, grade7, grade8, grade9;

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

		// Use a switch to decide where to store values
		switch (i) {
		case 0: SID0 = SID_in; grade0 = grade_in; break;
		case 1: SID1 = SID_in; grade1 = grade_in; break;
		case 2: SID2 = SID_in; grade2 = grade_in; break;
		case 3: SID3 = SID_in; grade3 = grade_in; break;
		case 4: SID4 = SID_in; grade4 = grade_in; break;
		case 5: SID5 = SID_in; grade5 = grade_in; break;
		case 6: SID6 = SID_in; grade6 = grade_in; break;
		case 7: SID7 = SID_in; grade7 = grade_in; break;
		case 8: SID8 = SID_in; grade8 = grade_in; break;
		case 9: SID9 = SID_in; grade9 = grade_in; break;
		} // switch
	} // for

	// Now print the grades for verification
	System.out.println("\nThese are the grades you entered:");
	System.out.println("Student ID: "+SID0+"\tgrade: "+grade0);
	System.out.println("Student ID: "+SID1+"\tgrade: "+grade1);
	System.out.println("Student ID: "+SID2+"\tgrade: "+grade2);
	System.out.println("Student ID: "+SID3+"\tgrade: "+grade3);
	System.out.println("Student ID: "+SID4+"\tgrade: "+grade4);
	System.out.println("Student ID: "+SID5+"\tgrade: "+grade5);
	System.out.println("Student ID: "+SID6+"\tgrade: "+grade6);
	System.out.println("Student ID: "+SID7+"\tgrade: "+grade7);
	System.out.println("Student ID: "+SID8+"\tgrade: "+grade8);
	System.out.println("Student ID: "+SID9+"\tgrade: "+grade9);
	} // main
} // class