
public class InitArray1 
{
   public static void main( String args[] )
   {
    double n[] = new double[ 5 ];
		for (int i=0; i<5; i++)
		n[i] = i + 1;
      
      //String array[]; // declare array named array

      //array = new String[ 10 ]; // create the space for array
      
      System.out.println( "Index\tValue" ); // column headings
   
      // output each array element's value 
      for ( int counter = 0; counter < n.length; counter++ )
         System.out.println(counter+"\t"+n[ counter ] );
  
   
   } // end main
} // end class InitArray