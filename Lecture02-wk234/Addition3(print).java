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
		double number1, // first number to add
	            number2, // second number to add
                    result,
                    sum; // sum of number1 and number2
                    
		// read in first number from user as a string
		firstNumber = JOptionPane.showInputDialog("Enter first number" );
		
		// read in second number from user as a string
		secondNumber =JOptionPane.showInputDialog("Enter second number" );

		// convert numbers from type String to type int
		number1 = Double.parseDouble( firstNumber );
		number2 = Double.parseDouble( secondNumber );

		// add the numbers
		sum = number1 + number2;
		result=Math.max(number1,number2);

		// display the results
		JOptionPane.showMessageDialog(null, "The sum is " + sum, "Results",JOptionPane.PLAIN_MESSAGE );
		JOptionPane.showMessageDialog(null, "The max is " + result, "Results",JOptionPane.PLAIN_MESSAGE );
		result=Math.min(number1,number2);
		JOptionPane.showMessageDialog(null, "The min is " + result, "Results",JOptionPane.PLAIN_MESSAGE );
		
		result=Math.pow(number1,number2);
		JOptionPane.showMessageDialog(null, "The power is " + result, "Results",JOptionPane.PLAIN_MESSAGE );
		
		System.out.println("PI = " + Math.PI);
		System.out.println("The square root of 9  = " + Math.sqrt(9.0));
		
		System.exit( 0 ); // terminate the program
	}
}