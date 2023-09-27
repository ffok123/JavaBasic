/* structure is Clear
	1) declare and initalize	
	2) read in number
	3) convert String to int
	4) Sum up
	5) print result	
*/

import javax.swing.JOptionPane;

public class Addition3 {
	
	public static void main(String args[]){
		
		String firstNumber,//first string entered by user
		       secondNumber; //second string entered by user
		int number1, // first number to add
	            number2, // second number to add
                    sum; // sum of number1 and number2
                    
		// read in first number from user as a string
		firstNumber = JOptionPane.showInputDialog("Enter first integer" );
		
		// read in second number from user as a string
		secondNumber =JOptionPane.showInputDialog("Enter second integer" );

		// convert numbers from type String to type int
		number1 = Integer.parseInt( firstNumber );
		number2 = Integer.parseInt( secondNumber );

		// add the numbers
		sum = number1 + number2;

		// display the results
		JOptionPane.showMessageDialog(null, "The sum is " + sum, "Results",JOptionPane.PLAIN_MESSAGE );

		System.exit( 0 ); // terminate the program
	}
}