// Fig. 3.1: GradeBook.java
// Class declaration with one method.
		
class GradeBook {
	
	private String courseName;
	private int abc;
	
	// display a welcome message to the GradeBook user
	public GradeBook(){
		
	}
	   
	public void displayMessage(){
		System.out.println( "Welcome to the Grade Book!" );
	} 
	
	// end method displayMessage
	public String getCourseName(){
		return courseName;
	}
	
	public int getInfo(){
		return abc;
	}
	   
	public void setCourseName(String name){
	   	courseName=name;
	}
	   
} // end class GradeBook


public class GradeBookCombine {
   
	// main method begins program execution
	public static void main(String args[]){ 

		// create a GradeBook object 
		GradeBook myGradeBook = new GradeBook();
	
		// call myGradeBook's displayMessage method
		myGradeBook.displayMessage();
		System.out.println();
	      	System.out.println(myGradeBook.getCourseName());
	        System.out.println(myGradeBook.getInfo());
	        
	        myGradeBook.setCourseName("Java 123");
	        System.out.println(myGradeBook.getCourseName());

	} // end main

} // end class GradeBookTest