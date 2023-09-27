//Q1 ) Solution: A
//Q2 ) Solution: A
//======================
//Q3 ) Solution 
public class ArrayTest {
	public static void main( String args[] )   {
   
	String s[] = {"Chan"," ", "Tai"," ","Man"}; 
	
	
	System.out.print ( "My name is " ); 
   
	// output each array element's value 
	for ( int counter = 0; counter < s.length; counter++ )
	System.out.print(s[ counter ] );
  
   
   } // end main
} // end class InitArray
//======================
public class ArrayTest{
	public static void main( String args[] )   {
   
	String s[] = new String[5];
	s[0] = new String("Chan");
	s[1] = new String(" ");
	s[2] = new String("Tai");
	s[3] = new String(" ");
	s[4] = new String("Man");
	
	System.out.print ( "My name is " ); 
   
	// output each array element's value 
	for ( int counter = 0; counter < s.length; counter++ )
	System.out.print(s[ counter ] );
 
   
   } // end main
} // end class


