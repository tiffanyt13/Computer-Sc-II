import java.util.Scanner;

/********************************************************************
 *  11.10 (Implement MyStack using inheritance) In Listing 11.10, 	*
 *  MyStack is implemented using composition. Define a new stack 	*
 *  class that extends ArrayList. Implement MyStack. Write a test 	*
 *  program that prompts the user to enter 							*
 *  five strings and displays them in reverse order.				*
 ********************************************************************/

public class Exercise11_10 {
	public static void main(String[] args) {

		MyStack stack = new MyStack();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 Strings.... ");
		for( int i = 0; i < 5; i++) stack.push(input.next());

		System.out.println("Your strings in reverse order: ");
		while(stack.size() > 0) {
			System.out.println(stack.pop());
			input.close();
		}
	}
}
