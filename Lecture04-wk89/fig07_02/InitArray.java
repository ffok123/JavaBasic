public class InitArray 
{
   public static void main( String args[] )
   {
      int array[]; 
      array = new int[ 10 ]; 
      
      // column headings
      System.out.println("Index\tValue" ); 
   
      for ( int counter = 0; counter < array.length; counter++ )
         System.out.println(counter+"\t"+array[ counter ] );
         
   } // end main
} // end class InitArray

