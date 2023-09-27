//assign array a to array b
public class SumArray 
{
   public static void main( String args[] )
   {
      int a[] = {10,20,30,40,50}; 
      //test a[7]=100;
      
      // column headings
      System.out.println("Index\tValue" ); 
      for ( int counter = 0; counter < a.length; counter++ )
         System.out.println(counter+"\t"+a[ counter ] );
         
         System.out.println(); // blank line
         
         for ( int i = 0; i < b.length; i++ )
         System.out.println(i+"\t"+b[ i ] );
         
   } // end main
} // end class InitArray


/* Result :
F:\>java SumArray
Index   Value
0       10
1       20
2       30
3       40
4       50

0       10
1       20
2       30
3       40
4       50
*/