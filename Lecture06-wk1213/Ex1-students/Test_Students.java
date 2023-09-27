// Program to test students class
public class Test_Students {
	public static void main (String args[] ) {
		Students s;		// reference to an object
		s = new Students();	// creates an instance by calling the constructor
		s.id = 12345;		// sets the id property
		s.grade = 99.5f;		// sets the grade property
		
		System.out.print("Student " + s.id);
		if (s.promoteToNextYear())
			System.out.println(" will be promoted.");
		else
			System.out.println(" will repeat.");
	}
}
