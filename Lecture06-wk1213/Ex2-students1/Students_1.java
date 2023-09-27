// Class definition for students
public class Students_1 {
	public int id;
	public float grade;

	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}

	public void setGrade(float grade) {
		if (grade >= 0) 
			this.grade = grade;
	}
	public float getGrade() {
		return grade;
	}
		
	public boolean promoteToNextYear() {
		return ((grade >= 40) ? true : false);
	}
}