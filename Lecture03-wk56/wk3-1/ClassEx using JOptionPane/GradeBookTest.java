// Fig. 4.10: GradeBookTest.java
// Create GradeBook object and invoke its determineClassAverage method.
import javax.swing.*; // program uses class Scanner

class GradeBook 
{
   private String courseName; 

   // constructor initializes courseName
   public GradeBook( String name )
   {
      courseName = name; 
   } 

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
      // getCourseName gets the name of the course
      System.out.printf( "Welcome to the grade book for\n%s!\n\n", 
         getCourseName() );
   } // end method displayMessage

   // determine class average based on 10 grades entered by user
   public void determineClassAverage() 
   {
      

      int total; // sum of grades entered by user
      int gradeCounter; // number of the grade to be entered next
      int grade; // grade value entered by user
      int average; // average of grades
	  String a;
      // initialization phase
      total = 0; // initialize total
      gradeCounter = 1; // initialize loop counter
   
      // processing phase
      while ( gradeCounter <= 10 ) // loop 10 times
      {
         // create Scanner to obtain input from command window
         a=JOptionPane.showInputDialog("Please Enter " + gradeCounter + " number");
         grade=Integer.parseInt(a);
         total = total + grade; // add grade to total
         gradeCounter = gradeCounter + 1; // increment counter by 1
      } // end while
   
      // termination phase
      average = total / 10; // integer division yields integer result

      // display total and average of grades
      System.out.printf( "\nTotal of all 10 grades is %d\n", total );
      System.out.printf( "Class average is %d\n", average );
   } // end method determineClassAverage

} // end class GradeBook

public class GradeBookTest
{
   public static void main( String args[] )
   {
      // create GradeBook object myGradeBook and 
      // pass course name to constructor
      GradeBook myGradeBook = new GradeBook( 
         "CS101 Introduction to Java Programming" );

      myGradeBook.displayMessage(); // display welcome message
      myGradeBook.determineClassAverage(); // find average of grades
   } // end main

} // end class GradeBookTest
