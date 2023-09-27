		// Fig. 3.10: GradeBook.java
		// GradeBook class with a constructor to initialize the course name.
		
		class GradeBook
		{
		   private String courseName; // course name for this GradeBook
		
		   // constructor initializes courseName with String supplied as argument
		   public GradeBook( String name )                                       
		   {                                                                     
		      courseName = name; // initializes courseName                       
		   } // end constructor                                                  
		
		   // method to set the course name
		   public void setCourseName( String name )
		   {
		      courseName = name; // store the course name
		   } // end method setCourseName
		
		   // method to retrieve the course name
		   public String getCourseName()
		   {
		      return courseName;
		   } // end method getCourseName

		   // display a welcome message to the GradeBook user
		   public void displayMessage()
		   {
		      // this statement calls getCourseName to get the 
		      // name of the course this GradeBook represents
		      System.out.printf( "Welcome to the grade book for\n%s!\n", 
		         getCourseName() );
		   } // end method displayMessage
		
		} // end class GradeBook


		public class GradeBookTest
		{
		   // main method begins program execution
		   public static void main( String args[] )
		   { 
		      // create GradeBook object
		      GradeBook gradeBook1 = new GradeBook(         
		         "CS101 Introduction to Java Programming" );
		      GradeBook gradeBook2 = new GradeBook(         
		         "CS102 Data Structures in Java" );         
		
		      // display initial value of courseName for each GradeBook
		      System.out.printf( "gradeBook1 course name is: %s\n",
		         gradeBook1.getCourseName() );
	                        System.out.printf( "gradeBook2 course name is: %s\n",
		         gradeBook2.getCourseName() );
		   } // end main
		
		} // end class GradeBookTest

