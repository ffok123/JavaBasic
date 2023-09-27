import javax.swing.JOptionPane;

public class RollDice2 {
	public static void main (String args[]){
		
		//generate a random number
		int dice;
		dice = 1 + (int) (Math.random() * 6);
				
		//enter guess
		String strNumber = JOptionPane.showInputDialog("Enter your guess: ");
		int number1=Integer.parseInt(strNumber);
		
		boolean test=true;
		int noOfGuess=1;
		
		while (test){
			
		if (number1==dice){
			System.out.println("You won!");
			break;
			
			}
			
		else {
			System.out.println("The dice says " + dice);
			System.out.println("You lose!");
			noOfGuess++;
		}
			
		strNumber = JOptionPane.showInputDialog("Enter your guess: ");
		number1=Integer.parseInt(strNumber);
			
			
		}
		
		System.out.print("You have guess " + noOfGuess + " times");
				
		
	}
}
