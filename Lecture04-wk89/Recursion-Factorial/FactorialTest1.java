//Program 2 to Study-Recusion 
public class FactorialTest1	{  
	 
	 // calculate factorials of 0-10
	 public static void main( String args[] ){
	 
	      FactorialTest1 factorial = new FactorialTest1();
	      factorial.displayFactorials();
	   
	 } // end main
	 
	 public double factorial( double number ) {           
                                              
		if ( number <= 1 ) 			// test for base case     
                     return 1; 					// base cases: 0! = 1 and 1! = 1
	      else 								// recursion step                       
	      return number * factorial( number - 1 );  
	 } 										                   
	
		
		public void displayFactorials() {
	      for ( int counter = 0; counter <= 10; counter++ )
	         System.out.println(counter +"\t"+ factorial( counter ) );
		}  
	   
} // end class FactorialTest




