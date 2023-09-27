import javax.swing.*;
public class BinarySearch {
	
  public static void main(String argv[]) {
	int test[]=new int[15];
	System.out.println("Please enter " + test.length + " marks");
	
	for(int i=0; i<test.length; i++) {
		String strNum = JOptionPane.showInputDialog("Enter the number ");
		test[i]=Integer.parseInt(strNum);
	}
	int total = 0;
	
	// add each element's value to total                      
	for ( int i = 0; i < test.length; i++ )
	 		{ total += test[ i ];  }
	 		                           
			System.out.println("The total mark is " +total );
	    System.out.println( "Average mark is: " +total/test.length );
	
			String strKey = JOptionPane.showInputDialog("Enter the key ");
			int sKey=Integer.parseInt(strKey);
			int position=binarySearch(test, sKey);
			
			if(position == -1)
					System.out.println("No key found");
			else
					System.out.println("We find the key in position "+ position);	
	
	}//end main
	
	public static int linearSearch ( int a[], int key ) {
		
	for (int n=0; n < a.length; n++) {
			if ( a[n] == key )
				return n;
	   
	}//end for
	return -1;
  	
  }//end linearSearch method
  
	public static int binarySearch( int array[], int key ){
			int low = 0; // low subscript
			int high = array.length - 1; // high subscript
			int middle; // middle subscript
			while ( low <= high ) {
				  
					middle = ( low + high ) / 2;
					System.out.println(array[ middle ]);
					if ( key == array[ middle ] ) // match
			return middle;
			else if ( key < array[ middle ] )
					high = middle - 1; // search low end of array
			else
					low = middle + 1; // search high end of array
			}
			return -1; //

	}//end binary search

}