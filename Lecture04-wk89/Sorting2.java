import javax.swing.*;
public class Sorting2 {
  public static void main(String argv[]) {
       
	int test[]=new int[5];
	System.out.println("Please enter " + test.length + " marks");
	
	for(int i=0; i<test.length; i++) {
		String strNum = JOptionPane.showInputDialog("Enter the number ");
		test[i]=Integer.parseInt(strNum);
	}
	System.out.print("Before sorting: ");
	
	for(int i=0; i<test.length; i++) {
		System.out.print(" "+test[i]);
	}
	System.out.println();
	System.out.print("After sorting: ");
	
	//-----------------------------------------
	//Sorting
	//-----------------------------------------	
	for(int s=0; s<test.length-1; s++) {
			for(int t=s+1; t<test.length; t++) {
				if(test[t] > test[s]){
					int temp = test[t];
					test[t]=test[s];
					test[s] = temp;
					} //end if
			}	//end nested for
	}//end outer for
	
	//print result	
	for(int i=0; i<test.length; i++) {
		System.out.print(" "+test[i]);
	}
	
	}//end main
}
	
	
	