import java.util.ArrayList;
import java.util.Scanner;

/**********************************************************************
 * (Addition quiz) Rewrite Listing 5.1 RepeatAdditionQuiz.java to 	  *
 * alert the user if an answer is entered again. Hint: use an array   *
 * list to store answers. Here is a sample run: What is 5 + 9? 12;    *
 * Wrong answer. Try again. What is 5 + 9? 34; Wrong answer. 	      *
 * Try again. What is 5 + 9? 12; You already entered 12; Wrong answer.* 
 * Try again. What is 5 + 9? 14 You got it!							  *
 **********************************************************************/
public class Exercise11_16 {
	public static void main(String[] args) {
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> repeatedAnswers = new ArrayList<>();
		
		System.out.print("What is " + number1 + " + " + number2 + "?" );
		int answer = input.nextInt();
		
		while (number1 + number2 != answer) {
			if(repeatedAnswers.contains(answer)) {
				System.out.println("You already answered " + answer);
			}
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "?" );
			repeatedAnswers.add(answer);
            answer = input.nextInt();
		}
		System.out.println("You got it!");
		
		input.close();
	}
}