import java.util.Scanner;

class gusser{
	// int guessNum ;
	public int guessingNum(){
		System.out.println("Guessor! please Guess the number between 1 to 100 :");
		Scanner sc = new Scanner(System.in);
		int guessNum = sc.nextInt();
		if(guessNum>1 && guessNum<=100){
		}
		else{
			System.out.println("please enter the  valid number ");
		
			System.exit(0);
		}
		return guessNum ;
	}
	
}

class player{
	// int guessNum;
	public int guessingNum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Player ! Guess the number");
		int guessNum = sc.nextInt();
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

			if(numberFromGuessor == numFromplayer2 && numberFromGuessor == numFromplayer3){ 
				System.out.println("player1 , player2, player3 maa ki chut sab jeet gaye :");
			}

			else if (numberFromGuessor == numFromplayer3) {
				System.out.println("player 1 and player 3 both win");
			}
		

			else if (numberFromGuessor == numFromplayer2 ){
				System.out.println("player1 , player2  both win");
			}
			else{

				System.out.println("Player 1 won the game ");
			}


		}

		else if(numberFromGuessor == numFromplayer2){
			System.out.println("player2 guess the number right you won ");
		}

		else if(numberFromGuessor == numFromplayer3){
			System.out.println("player3 guess the number right you won ");
		}

		else{
			System.out.println("sab ke sab galat");
			// guessingNum();
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



// =====================================================================================================================================================================

// import java.util.Scanner;

// class gusser{
// 	int guessNum ;
// 	public int guessingNum(){
// 		System.out.println("Guessor! please Guess the number:");
// 		Scanner sc = new Scanner(System.in);
// 		guessNum = sc.nextInt();
// 		return guessNum ;
// 	}
// }

// class player{
// 	int guessNum;
// 	public int guessingNum(){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Player1! Guess the number");
// 		guessNum = sc.nextInt();
// 		return guessNum ;
// 	}
// }


// class umpire{
// 	int numberFromGuessor;
// 	int numFromplayer1 ;
// 	int numFromplayer2 ;
// 	int numFromplayer3 ;



// 	void collectNumFromGuessor(){
// 		gusser g = new gusser();
// 		numberFromGuessor = g.guessingNum();


// 	}


// 	void collectNumFromPlayer(){
// 		player p1 = new player() ;
// 		numFromplayer1 = p1.guessingNum();

// 		player p2 = new player() ;
// 		numFromplayer2 = p2.guessingNum();

// 		player p3 = new player() ;
// 		numFromplayer3 = p3.guessingNum();

		
// 	}

// 	void compare(){
// 		if(numberFromGuessor == numFromplayer1){
// 			System.out.println("player1 guess the number right you won ");
// 		}

// 		else if(numberFromGuessor == numFromplayer2){
// 			System.out.println("player1 guess the number right you won ");
// 		}

// 		else if(numberFromGuessor == numFromplayer3){
// 			System.out.println("player1 guess the number right you won ");
// 		}

// 		else{
// 			System.out.println("sab ke sab galat");
// 			// guessr();
// 		}
	
// 	}

// }


// public class guessgame {

// 	public static void main(String[] args) {
// 		System.out.println("Game Started");
// 		umpire u = new umpire();
// 		u.collectNumFromGuessor();
// 		u.collectNumFromPlayer();
// 		u.compare();
		
// 	}
// }