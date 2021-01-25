import java.util.*;
public class SortThreeNumbers6_5 {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter 3 numbers. Type enter between each number: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		sortNumbers(number1, number2, number3);

		input.close();
	}

	public static void sortNumbers(double num1, double num2, double num3) {

		double temp;

		if(num2 < num1 && num2 < num3) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if ( num3 < num1 && num3 < num2) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}

		System.out.println(num1 + " " + num2 + " " + num3);
	}
}
