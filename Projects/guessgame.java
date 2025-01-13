import java.util.Scanner;

class gusser{
	int guessNum ;
	public int guessingNum(){
		System.out.println("Guessor! please Guess the number:");
		Scanner sc = new Scanner(System.in);
		guessNum = sc.nextInt();
		return guessNum ;
	}
}

class player{
	int guessNum;
	public int guessingNum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Player1! Guess the number");
		guessNum = sc.nextInt();
		return guessNum ;
	}
}


class umpire{
	int numberFromGuessor;
	int numFromplayer1 ;
	int numFromplayer2 ;
	int numFromplayer3 ;



	void collectNumFromGuessor(){
		gusser g = new gusser();
		numberFromGuessor = g.guessingNum();


	}


	void collectNumFromPlayer(){
		player p1 = new player() ;
		numFromplayer1 = p1.guessingNum();

		player p2 = new player() ;
		numFromplayer2 = p2.guessingNum();

		player p3 = new player() ;
		numFromplayer3 = p3.guessingNum();

		
	}

	void compare(){
		if(numberFromGuessor == numFromplayer1){
			System.out.println("player1 guess the number right you won ");
		}

		else if(numberFromGuessor == numFromplayer2){
			System.out.println("player2 guess the number right you won ");
		}

		else if(numberFromGuessor == numFromplayer3){
			System.out.println("player3 guess the number right you won ");
		}

		else{
			System.out.println("sab ke sab galat");
			// guessr();
		}
	
	}

}


public class guessgame {

	public static void main(String[] args) {
		System.out.println("Game Started");
		umpire u = new umpire();
		u.collectNumFromGuessor();
		u.collectNumFromPlayer();
		u.compare();
		
	}
}