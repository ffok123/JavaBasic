import javax.swing.JOptionPane;

public class RollDice1 {
	public static void main (String args[]){
		
		//Scanner input=new Scanner(System.in);
		int dice;
				
		//System.out.print("What is your guess? Press ENTER");
		String strNumber = JOptionPane.showInputDialog("Enter your guess: ");
		int number1=Integer.parseInt(strNumber);
		//int number1=input.nextInt();
		
	        dice = 1 + (int) (Math.random() * 6);
				
		
		if (number1==dice)
			System.out.println("You won!");
			
		else {
			System.out.println("The dice says " + dice);
			System.out.println("You lose!");
		}
		
		
	}
}
