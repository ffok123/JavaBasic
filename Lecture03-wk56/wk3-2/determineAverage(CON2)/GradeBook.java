
import javax.swing.JOptionPane; // program uses class Scanner

public class GradeBook 
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
      // initialization stage
      
      
      
      
      
      
      // Processing stage
      
      
      
      
      
      
      // Termination stage
      
      
      
      
      
      
   } // end method determineClassAverage

} // end class GradeBook