//Program to Study-Recusion 

public class FactorialTest	{  
	 
	 // calculate factorials of 0-10
	 public static void main( String args[] ){
	 
	      FactorialCalculator factorialCalculator = new FactorialCalculator();
	      factorialCalculator.displayFactorials();
	   
	   } // end main
   } // end class FactorialTest

class FactorialCalculator	{                    
		public double factorial( double number ) {           
                                              
		if ( number <= 1 ) 			// test for base case     
        			return 1; 					// base cases: 0! = 1 and 1! = 1
	        else 								// recursion step                       
	       return number * factorial( number - 1 );  
	   } 											// end method factorial                       
	
	   // output factorials for values 0-10
	   public void displayFactorials()
	   {
	      // calculate the factorials of 0 through 10
	      for ( int counter = 0; counter <= 10; counter++ )
	         System.out.println(counter +"\t"+ factorial( counter ) );
	   } // end method displayFactorials
} // end class FactorialCalculator



