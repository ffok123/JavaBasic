// Accessing students properties through access methods (GET / SET)
public class Test_Students1 {
	public static void main (String args[] ) {
		Students1 s;		// reference to an object
		s = new Students1();	// creates an instance by calling the constructor
		s.setId( 12345 );		// sets the id property
		s.setGrade( 99.5f );		// sets the grade property
		
		System.out.print("Student " + s.getId() );
		if (s.promoteToNextYear())
			System.out.println(" will be promoted.");
		else
			System.out.println(" will repeat.");
	}
}
