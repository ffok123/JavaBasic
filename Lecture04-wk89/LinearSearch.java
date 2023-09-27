import javax.swing.*;
public class LinearSearch {
	
  public static void main(String argv[]) {
	int test[]=new int[5];
	System.out.println("Please enter " + test.length + " marks");
	
	for(int i=0; i<test.length; i++) {
		String strNum = JOptionPane.showInputDialog("Enter the number ");
		test[i]=Integer.parseInt(strNum);
	}
	int total = 0;
	
	// add each element's value to total                      
	for ( int i = 0; i < test.length; i++ )
	 		total += test[ i ];                             
			System.out.println("The total mark is " +total );
	    System.out.println( "Average mark is: " +total/test.length );
		
			String strKey = JOptionPane.showInputDialog("Enter the key ");
			int sKey=Integer.parseInt(strKey);
			int position=linearSearch(test, sKey);
			
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
}