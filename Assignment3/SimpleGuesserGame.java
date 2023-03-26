import java.util.Scanner;

class Player //class name should be in Pascal Convention 
{
	int num;
	int gessNum(int i)   //method  should be in camelCase 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Player " + i +" Guess the number");
		num = sc.nextInt();
		
		return num;
	}
}


class Guesser //class name should be in Pascal Convention 
{
	int num;
	int gessNum()   //method  should be in camelCase 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser Guess the number");
		num = sc.nextInt();
		return num;
	}
}


class Umpire //class name should be in Pascal Convention 
{
	int guessNumFromPlayer1;
	int guessNumFromPlayer2;
	int guessNumFromPlayer3;
	int guessNumFromGuesser;
	int trial=0;
	
	
	
	void collectNumFromGuesser() {
		Guesser g =new Guesser();
		guessNumFromGuesser = g.gessNum();
	}
	
	void collectNumFromPlayer1() {
		Player p =new Player();
		guessNumFromPlayer1 = p.gessNum(1);
	}
	
	void collectNumFromPlayer2() {
		Player p =new Player();
		guessNumFromPlayer2 = p.gessNum(2);
	}
	
	void collectNumFromPlayer3() {
		Player p =new Player();
		guessNumFromPlayer3 = p.gessNum(3);	
	}
	
	void compare() {
		trial++;
		if(guessNumFromPlayer1 == guessNumFromGuesser && guessNumFromPlayer2 == guessNumFromGuesser && guessNumFromPlayer3 == guessNumFromGuesser) {
					System.out.println("All player won the game");
		}
		else if(guessNumFromPlayer1 == guessNumFromGuesser && guessNumFromPlayer2 == guessNumFromGuesser ) {
			System.out.println("Player1 and Player2 won the game");
		}
		else if(guessNumFromPlayer1 == guessNumFromGuesser && guessNumFromPlayer3 == guessNumFromGuesser ) {
			System.out.println("Player1 and Player3 won the game");
		}
		else if(guessNumFromPlayer2 == guessNumFromGuesser && guessNumFromPlayer3 == guessNumFromGuesser ) {
			System.out.println("Player2 and Player3 won the game");
		}

		else if(guessNumFromPlayer1 == guessNumFromGuesser) {
			System.out.println("Player1 won the game");
		}
		
		else if(guessNumFromPlayer2 == guessNumFromGuesser) {
			System.out.println("Player2 won the game");
		}
		
		else if(guessNumFromPlayer3 == guessNumFromGuesser) {
			System.out.println("Player3 won the game");
		}
		
		else {
			System.out.println();
			System.out.println("All Lose!!!!!");
			if(trial !=3) {
				System.out.println("Players you have "+ (3 - trial) + " chances");
				System.out.println("--------------------------------------");
				collectNumFromGuesser(); 
				collectNumFromPlayer1();
				collectNumFromPlayer2();
				collectNumFromPlayer3();
				compare();
				
			}
			else {
				System.out.println("Trial Over");
			}
		}
	}
}




public class SimpleGuesserGame {

	public static void main(String[] args) {
		Umpire umpire = new Umpire();
		umpire.collectNumFromGuesser();
		umpire.collectNumFromPlayer1();
		umpire.collectNumFromPlayer2();
		umpire.collectNumFromPlayer3();
		umpire.compare();
	}
}
