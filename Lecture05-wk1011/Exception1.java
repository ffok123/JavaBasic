import javax.swing.*; 

public class Exception1{ 

	public static void main(String args []) {
	
	try { 

	String num1String = JOptionPane.showInputDialog("Give me the first number" );
	int num1 = Integer.parseInt ( num1String ); 
	
	String num2String = JOptionPane.showInputDialog("Give me the second number" ); 
	int num2 = Integer.parseInt( num2String ); 

	int n3 = num1 / num2;
	System.out.println(num1 + " / " + num2 + " = " + n3); 
	
	}

	catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(null ,"Please input a valid integer",
		"Number Format Error", JOptionPane.ERROR_MESSAGE );
	}
	
	catch (ArithmeticException e) {
		JOptionPane.showMessageDialog(null , "Attempted to Divide by Zero", 
		"Arithmetic Error", JOptionPane.ERROR_MESSAGE );
	}
	System.exit(0);
	 
	}
}