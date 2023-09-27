import java.util.*;
public class RollDice {
	public static void main (String args[]){
		
		Scanner input=new Scanner(System.in);
		int dice;
				
		System.out.print("What is your guess? Press ENTER");
		int number1=input.nextInt();
		
	        dice = 1 + (int) (Math.random() * 6);
		if (number1==dice)
			System.out.println("You won!");
		else {
			System.out.println("The dice says " + dice);
			System.out.println("You lose!");
		}
	}
}
