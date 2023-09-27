// Fig. 3.17: Dialog1.java
// Printing multiple lines in dialog box.

import javax.swing.JOptionPane; // import class JOptionPane
		
	public class Dialog1 {
		
		public static void main( String args[] ) {

	        // display a dialog with the message 
		JOptionPane.showMessageDialog(null, "Welcome\nto\nJava" );
		//JOptionPane.showMessageDialog(null, "The sum is 10" , "Results" ,JOptionPane.QUESTION_MESSAGE);
               //JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);    
                  
/* Different type
ERROR_MESSAGE 
INFORMATION_MESSAGE 
WARNING_MESSAGE 
QUESTION_MESSAGE 
PLAIN_MESSAGE
*/
		
		} // end main
	} // end class Dialog1


