public class Logistics_Student extends Student {
	
	public float Logistics_grade;
	
	public Logistics_Student (int id, String name) {
		super(id, name);		// superclass constructor
		courseName = "Logistics and Transport"; 
	}
	public void setLOG_grade (float newValue) 
		{ Logistics_grade = newValue;}
	
	public float getLOG_grade () 
		{ return Logistics_grade ; }
}
