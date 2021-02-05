import java.util.Random;

/* ****************************************************
 * Modified: *9.4 (Use the Random class) 			  *
 * Write a program that creates a Random object 	  *
 * with seed 1000 and displays the first 5 			  *
 * random integers between 0 and 100 using the		  *
 * nextInt(100) method. Repeat the list three times.  *
 *******************************************************/
public class Random9_4 {

	public static void main(String[] args) {
		Random rand = new java.util.Random(1000);

		for (int i = 0; i < 5; i++) {
			System.out.print(rand.nextInt(100) + " ");
		}
		System.out.println();
		Random rand2 = new java.util.Random(1000);

		for (int i = 0; i < 5; i++) {
			System.out.print(rand2.nextInt(100) + " ");
		}

		System.out.println();
		Random rand3 = new java.util.Random(1000);

		for (int i = 0; i < 5; i++) {
			System.out.print(rand3.nextInt(100) + " ");
		}


	}
}