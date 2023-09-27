		// Fig. 2.7: Addition.java
		// Addition program that displays the sum of two numbers.
		import java.util.Scanner; // program uses class Scanner
		
		public class Addition2 
		{
		   // main method begins execution of Java application
		   public static void main( String args[] )
		   {
		      // create Scanner to obtain input from command window
		      Scanner input = new Scanner( System.in );            
		
		      double number1; // first number to add   
		      int number2; // second number to add  
	      	      double sum; // sum of number1 and number2
		
		      System.out.print( "Enter first integer: " ); // prompt   
		      number1 = input.nextDouble(); // read first number from user

		      System.out.print( "Enter second integer: " ); // prompt 
      	      	      number2 = input.nextInt(); // read second number from user
		
	 	      sum = number1 + number2; // add numbers
		
		      System.out.printf( "Sum is %.2f\n", sum ); // display sum
		
		   } // end method main
		
		} // end class Addition

