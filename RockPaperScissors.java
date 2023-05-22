import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	
	public static String computerTurn() {
		Random rng = new Random();
		
		String[] rpc = new String[] { "Rock", "Paper", "Scissors" };
		int randomIndex = rng.nextInt( rpc.length );
		String randomComp = rpc[randomIndex];
		return randomComp;
		
	}

	public static void main(String[] args) {

		
		boolean playAgain = true;
		
		do {
			
		int ties=0;
		int userWins=0;
		int computerWins=0;
			
		Scanner sc = new Scanner(System.in); 

		System.out.println("\n *** Welcome to RockPaperScissors Game ***");
		System.out.println("------------------------"); 
		System.out.println("How many rounds do you want to play: please choose from 1-10)");  
		int rounds = sc.nextInt();
		if (rounds == 0 || rounds > 10) {
			System.out.println("You are not enter the correct rounds number. Bye!");
		}
		
		int i=1, n= rounds;
		do {
			System.out.println("Paper (0), Rock (1), or Scissors (2)?");
			int user = sc.nextInt();
			
			String comp = computerTurn();
			System.out.println("Computer chose: " + comp);
			
			if (user == 0) { // Paper 
				if (comp.equals("Paper")) {
					ties += 1;
					System.out.println("It's a tie!");
					
				} else if (comp.equals("Rock")) {
					userWins += 1;
					System.out.println("User win!");
					
				} else {
					computerWins += 1;
					System.out.println("Computer win!");
					
				}
			} else if (user == 1) {  // Rock
				if (comp.equals("Rock")) {
					ties += 1;
					System.out.println("It's a tie!");
					
				} else if (comp.equals("Scissors")) {
					userWins += 1;
					System.out.println("User win!");
					
				} else {
					computerWins += 1;
					System.out.println("Computer win!");
					
				}
			} else {    // user is Scissors
				if (comp.equals("Scissors")) {
					ties += 1;
					System.out.println("It's a tie!");	
				} else if (comp.equals("Paper")) {
					userWins += 1;
					System.out.println("User win!");	
				} else {
					computerWins += 1;
					System.out.println("Computer win!");
					
				}
			}
				
			i++;			
		} while(i <= rounds );

		System.out.println("------------------------"); 
	
		if (computerWins > userWins) {
			System.out.println("Final Result: Computer win!");
		} else if (computerWins < userWins) {
			System.out.println("Final Result: User win!");
		} else {
			System.out.println("Final Result: It's a tie!");
		}
		
		System.out.println("------------------------"); 
		System.out.println("Do you want to play again? (y/n)");
		String restart = sc.next().toLowerCase();
		
		if (restart.indexOf('n')==0) {
			playAgain = false;
			
		}
		
	} while(playAgain);
		
	System.out.println("Thanks for playing!");
		
	}
}
