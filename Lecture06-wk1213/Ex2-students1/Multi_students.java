// Program to test students class
public class Multi_students {
	public static void main (String args[] ) {
		Students_1 s1, s2, s3;	// declare references
		s1 = new Students_1();	// creates first instance
		s2 = new Students_1();	// creates second instance
		s3 = new Students_1();	// creates third instance

		s1.id = 10001;		// sets the id property
		s1.grade = 99.5f;	// sets the grade property
		s2.id = 10002;		// sets the id property
		s2.grade = 49.5f;	// sets the grade property
		s3.id = 10003;		// sets the id property
		s3.grade = 35.5f;	// sets the grade property
		
		System.out.println("Student " + s1.id +
			(s1.promoteToNextYear()?" will be promoted.":" will repeat.") );
		System.out.println("Student " + s2.id +
			(s2.promoteToNextYear()?" will be promoted.":" will repeat.") );
		System.out.println("Student " + s3.id +
			(s3.promoteToNextYear()?" will be promoted.":" will repeat.") );
	}
}
