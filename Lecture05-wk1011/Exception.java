import javax.swing.*; 
public class Exception{ 
	public static void main(String args []) {
	String num1String = JOptionPane.showInputDialog
                     ("Give me the first number" );
	int num1 = Integer.parseInt ( num1String ); 
	String num2String = JOptionPane.showInputDialog
                    ("Give me the second number" ); 
	int num2 = Integer.parseInt( num2String ); 
	int n3 = num1 / num2;
	System.out.println(num1 + " / " + num2 + " = " + n3); 
	System.exit(0);
	}
}
