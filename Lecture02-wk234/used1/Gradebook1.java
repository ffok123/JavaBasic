		// Fig. 3.1: GradeBook.java
		// Class declaration with one method.
		
		public class GradeBook1
		{
		   private String courseName;
                   // display a welcome message to the GradeBook user
		   public void displayMessage()
		   {
		      System.out.println( "Welcome to the Grade Book!" );
		   } // end method displayMessage

                   public void setCourseName(String name)
		   {
		      courseName = name;
		   }

                   public String getCourseName()
		   {
		      return courseName;
		   }
                   public GradeBook1( String name ){      
                        courseName = name; // initializes courseName	
                    }

		
		} // end class GradeBook

