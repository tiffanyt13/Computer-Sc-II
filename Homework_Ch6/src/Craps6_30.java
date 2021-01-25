
public class Craps6_30 {
	public static void main(String[] args) {
		craps();
	}

	public static int craps() {

		int first = 0;

		first = rollTwoDice();

		switch(first) {
		case 2: System.out.println("You lose!");
		break;
		case 3: System.out.println("You lose!");
		break;
		case 12:System.out.println("You lose!");
		break;
		case 7: System.out.println("You win!");
		break;
		case 11: System.out.println("You win!");
		break;
		default:
			System.out.println("The point is " + first);

			int two;
			do {
				two = rollTwoDice();

			}while (!(two == first || two == 7));

			if (two == 7) {
				System.out.println("You lose!");
			}else {
				System.out.println("You win!");
			}
		}
		return 0;

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
