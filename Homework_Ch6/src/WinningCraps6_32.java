
public class WinningCraps6_32 {
	public static void main(String[] args) {

		int win = 0, lose = 0;

		for (int i = 0; i < 10000; i++) {
			if (craps() == 1) {
				win++;
			}else {
				lose++;
			}


			System.out.println("Number of winning game is " + win);
			System.out.println("Number of losing game is " + lose);
			System.out.println("The chance of winning is " + (win / 10000.0));
		}
	}

	public static int craps() {

		int first = 0;
		int status;

		first = rollTwoDice();


		switch(first) {
		case 2: System.out.println("You lose!");
		case 3: System.out.println("You lose!");
		case 12:System.out.println("You lose!");
		status = -1;
		break;

		case 7: System.out.println("You win!");
		case 11: System.out.println("You win!");
		status = 1;
		break;
		default:
			System.out.println("The point is " + first);

			int two;
			do {
				two = rollTwoDice();

			}while (!(two == first || two == 7));

			if (two == 7) {
				System.out.println("You lose!");
				status = -1;
			}else {
				System.out.println("You win!");
				status = -1;
			}
			return status;
		}
		return status;


	}

	public static int rollDice() {
		return(int)(1 + Math.random() * 6);
	}

	public static int rollTwoDice() {
		int dice1 = rollDice();
		int dice2 = rollDice();
		int sum = dice1 + dice2;

		System.out.println("You roll " + dice1 + " + " + dice2 + "=" + sum);

		return sum;
	}
}



