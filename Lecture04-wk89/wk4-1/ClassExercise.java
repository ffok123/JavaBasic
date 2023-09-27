import javax.swing.JOptionPane;
public class ClassExercise {
	public static void main (String args[]){
		
		//Enter three integers
		String strNumber1 = JOptionPane.showInputDialog("Enter your guess: ");
		int number1=Integer.parseInt(strNumber1);
		
		String strNumber2 = JOptionPane.showInputDialog("Enter your guess: ");
		int number2=Integer.parseInt(strNumber2);
		
		String strNumber3 = JOptionPane.showInputDialog("Enter your guess: ");
		int number3=Integer.parseInt(strNumber3);
		
		//calling a method called maximum
		int result = maximum (number1, number2, number3 );
		
		System.out.print(result);
		
	}
	
	public static int maximum (int x, int y, int z) {
		
			return (Math.max( Math.max(x,y),z ));
		
		}
	    

}//end class
