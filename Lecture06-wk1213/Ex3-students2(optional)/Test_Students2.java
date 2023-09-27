// Program to test students class
public class Test_Students2 {
	public static void main (String args[] ) {
		Students_2 s;		// reference to an object
		s = new Students_2();	// creates an instance by calling the constructor
		s.setId ( 12345 );	
		s.setGrade ( 99.5f );
		s.certgrades[0] = 'A';
		System.out.print("Student " + s.getId() );
		if (s.promoteToNextYear())
			System.out.println(" will be promoted.");
		else
			System.out.println(" will repeat.");
	}
}
class Students_2 {
	public char certgrades[] = new char[5];
	private Students_1 s1 = new Students_1(); 

	public void setId (int newId) {	s1.id = newId; }
	public int getId () { return s1.id; }
	public void setGrade (float newGrade) {
		s1.grade = newGrade;
	}
	public float getGrade () { return s1.grade; }
	public boolean promoteToNextYear() {
		return s1.promoteToNextYear();
	}
}