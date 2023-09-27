public class Student {
	// The following properties allow package access
	int id;	String name; 
	int year;
	protected String courseName = null;
	
	public Student (int id, String name) {	// Constructor
		this.id = id; 
		this.name = name;
	}
	
	public int getId () { 
		return id; 
	}
	
	public String getName () { 
		return name; 
	}
	
	public void setYear (int newValue) {
		year = newValue;
	}
		
	public int getYear () { 
		return year; 
	}
	
	
										
}

