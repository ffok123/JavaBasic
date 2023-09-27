//calculate total and average for a group of student
import javax.swing.*;
public class Question {
  public static void main(String argv[]) {
       
	int test[]=new int[5];
	System.out.println("Please enter " + test.length + " marks");
	
	for(int i=0; i<test.length; i++) {
		String strNum = JOptionPane.showInputDialog("Enter the mark ");
		test[i]=Integer.parseInt(strNum);
		
	}
		
	int total = 0;

      // add each element's value to total                      
      for ( int i = 0; i < test.length; i++ )
         total += test[ i ];                             

      System.out.println("The total mark is " +total );
	    System.out.println( "Average mark is: " +total/test.length );
	    
}//end main

}	