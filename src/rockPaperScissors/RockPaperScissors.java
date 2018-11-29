package rockPaperScissors;
import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {

	public static void main(String[] args) {
		

		gameSetup("rock");
		
		//System.out.print(computerMove[random]);
		
	}
	
	public static String aiMove() {
		String computerMove[] = {"rock","paper","scissors"};
		int random = (int)(Math.random() * 3);
		return computerMove[random];
	}
	
	
	public static String getInput() {
		Scanner s = new Scanner(System.in);
		
		String output = s.nextLine();
		s.close();
		
		return output;
		
	}
	
	public static String gameSetup(String input) {
		
		
		int i = 0;
		if(i<3){
			i++;
			String input1 = s.nextLine();
			String ai = aiMove();
			//game(input,ai);
			System.out.println(i);
		return game(input,ai);
		}
		return null;
	}

	public static String game(String humanNormal, String computer) {
		
		String human = humanNormal.toLowerCase();
		
		if(human=="rock"||human=="paper"||human=="scissors") {
		if(human == computer) {
			System.out.println(human+" draws with "+computer);
			gameSetup("rock");
			return (human+" draws with "+computer);
		}
		else if(human=="rock") {
			if(computer=="paper") {
				System.out.println(computer+" beats "+human+", Player loses!");
				gameSetup("rock");
				return (computer+" beats "+human+", Player loses!");
			}
			else {
				System.out.println(human+" beats "+computer+", Player wins!");
				gameSetup("rock");
				return (human+" beats "+computer+", Player wins!");
			}
		}
		else if(human=="paper") {
			if(computer=="scissors") {
				return (computer+" beats "+human+", Player loses!");
			}
			else {
				return (human+" beats "+computer+", Player wins!");
			}
		}
		else{
			if(computer=="rock") {
				return (computer+" beats "+human+", Player loses!");
			}
			else {
				return (human+" beats "+computer+", Player wins!");
			}
		}
		}
		else {
			return "Error, please enter rock, paper or scissors!";
		}
		

}
	
	
	
}
