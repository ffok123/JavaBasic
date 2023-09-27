
public class BreakTest1 
{
   public static void main( String args[] )
   {
      
      for (int i=0; i<5; i++) {
			for (int j=i; j< 5; j++) {
			    System.out.println("In inside loop");
				//if (i+2==j){
				//System.out.println("Here");
				//break outside; //breaks the outer loop.
			    //}
			}
	        System.out.println("In outside loop");
	   }
	   System.out.println("Outside of outside");

      
      
      
   } // end main
} // end class BreakTest
