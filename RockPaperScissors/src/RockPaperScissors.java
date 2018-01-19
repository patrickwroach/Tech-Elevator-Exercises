import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	static String title = "Rock, Paper, Scissors!";
	static String[] options = new String[] {"Rock", "Paper", "Scissors"};
	public static void main(String[] args) {
		boolean running = true;
		Random rand = new Random();
		
		int humanWins = 0;
		int computerWins = 0;
		int tie = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to " + title);
		
		while (running) {
		System.out.println("Select (R)ock, (P)aper, (S)cissors or (Q)uit");
		String choice= in.nextLine();
		int computerChoice = rand.nextInt(3);
		String result = "";
		
		System.out.println("The Computer Chooses: " + options[computerChoice]);
		
		switch (choice.toUpperCase()) {
		case "Q":
			result = "Thank you for playing " + title;
			running = false;
			break;
		case "R":
			switch(computerChoice) {
			case 0: tie++; //Rock
					result = "It's a TIE!";
			break;
			case 1: computerWins++;// Paper
					result = "Computer Wins!";
				break;
			case 2: humanWins++; //Scissors
					result = "Player Wins!";
				break;
			}
			System.out.println(result);
			System.out.println("Player: " + humanWins + "Computer: " + computerWins + " Ties: " + tie);
			break;
		case "P":
			switch(computerChoice) {
			case 0: humanWins++; //Rock
					result = "Player Wins!";
			break;
			case 1: tie++;// Paper
					result = "Its a TIE!";
				break;
			case 2: computerWins++; //Scissors
					result = "Computer Wins!";
				break;
			}
			System.out.println(result);
			System.out.println("Player: " + humanWins + "Computer: " + computerWins + " Ties: " + tie);
			break;
		case "S":
			switch(computerChoice) {
			case 0: computerWins++; //Rock
					result = "Computer Wins!";
			break;
			case 1: humanWins++;// Paper
					result = "Player Wins!";
				break;
			case 2: tie++; //Scissors
					result = "It's a TIE!";
				break;
			}
			System.out.println(result);
			System.out.println("Player: " + humanWins + "Computer: " + computerWins + " Ties: " + tie);
			break;
			default: 
		}
		
		}

	}

}
