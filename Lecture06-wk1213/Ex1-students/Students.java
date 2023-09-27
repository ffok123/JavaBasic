// Class definition for students
public class Students {
	public int id;
	public float grade;

	public boolean promoteToNextYear() {
		return ((grade >= 40) ? true : false);
	}
}