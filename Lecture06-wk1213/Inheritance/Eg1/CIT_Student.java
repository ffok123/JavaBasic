public class CIT_Student extends Student {
	
	public float CIT_grade;
	
	public CIT_Student (int id, String name) {
		super(id, name);	// superclass constructor
		courseName = "Java";	// protected member 
	}
	
	public void setCIT_grade (float newValue) 
		{ CIT_grade = newValue;}
	
	public float getCIT_grade () 
		{ return CIT_grade; }
}
