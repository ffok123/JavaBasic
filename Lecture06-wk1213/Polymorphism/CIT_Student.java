public class CIT_Student extends Student {
	
	public float CIT_grade;
	
	public CIT_Student (int id, String name) {
			// superclass constructor
		super(id, name);
		courseName = "Java";	// protected member 
		
	}
	
	public void setCIT_grade (float newValue) 
		{ CIT_grade = newValue;}
	
	public float getCIT_grade () 
		{ return CIT_grade; }
		
	public void displayMessage (){
			System.out.println("The course Name is "+ getCourseName());
	}	
	
	public String getSubjName() { return "Java";}
	public float getSubjGrade() { return CIT_grade;}
	public void setSubjGrade(float newValue) {
		CIT_grade = newValue;
	}


		
}
