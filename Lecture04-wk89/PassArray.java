public class PassArray {
	
		   public static void main( String args[] )
		   {
		      int array[] = { 1, 2, 3, 4, 5 };
		      
		      System.out.println( 
		         "Effects of passing reference to entire array:\n" +
		         "The values of the original array are:" );
		
		      
		      for (int counter = 0; counter < array.length; counter++)
		         System.out.printf("	%d",array[counter]);
		   
		      modifyArray( array ); // pass array reference
		      
		      System.out.println( "\n\nThe values of the modified array are:" );
		
		      
		      for (int counter = 0; counter < array.length; counter++)
		         System.out.printf("	%d",array[counter]);
		   
		      System.out.println( 
		         "\n\nEffects of passing array element value:\n" +
		         "array[3] before modifyElement: "+array[ 3 ]  );

		      modifyElement( array[ 3 ] ); 
		      System.out.println( 
		         "array[3] after modifyElement:"+ array[ 3 ] );
		   } 
		   
		                        
		   public static void modifyArray( int array2[] )                
		   {                                                             
		      for ( int counter = 0; counter < array2.length; counter++ )
		         array2[ counter ] *= 2;                                 
		   }                                   
		   
		                                    
		   public static void modifyElement( int element )            
		   {                                                          
		      element *= 2;                                           
		      System.out.println(                                      
		         "Value of element in modifyElement: "+element );
		   }                               
		} 

