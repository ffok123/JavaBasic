//Sorting Example 1
import javax.swing.*;
public class Sorting
{
  public static void main(String[] args)
  {
  String strNumber1 = JOptionPane.showInputDialog("Enter first no: ");
	int num1=Integer.parseInt(strNumber1);
		
	String strNumber2 = JOptionPane.showInputDialog("Enter second nos: ");
	int num2=Integer.parseInt(strNumber2);
		
	String strNumber3 = JOptionPane.showInputDialog("Enter third no: ");
	int num3=Integer.parseInt(strNumber3);
		
    if (num1 > num2)
    {
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }

    if (num2 > num3)
    {
      int temp = num2;
      num2 = num3;
      num3 = temp;
    }

    if (num1 > num2)
    {
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }

    System.out.println("The sorted numbers are "
      + num1 + " " + num2 + " " + num3);
  }
}
