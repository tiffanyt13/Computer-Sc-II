
public class WinAgain {
	public static void main(String[] args) {

		int win = 0, lose = 0;

		for (int i = 0; i < 10000; i++) {
			if (1 == craps()) {
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
		return WinningCraps6_32.craps();
		
	}

	public static void rollDice() {
		WinningCraps6_32.rollDice();
	}

	public static void rollTwoDice() {
		WinningCraps6_32.rollTwoDice();
	}


}

