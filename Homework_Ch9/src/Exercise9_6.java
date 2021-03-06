/**************************************************
 *                    Exercise9_6				  *
---------------------------------------------------
 *    selectionSort: int list					  *
 **************************************************/
public class Exercise9_6 {
	public static void main(String[] args) {
		java.util.Random r = new java.util.Random();

		int[] numbers = new int[100_000];

		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(10_000);
		}

		Stopwatch stopWatch = new Stopwatch();
		selectionSort(numbers);
		stopWatch.stop();

		System.out.println("Sorting 100,000 numbers took " + stopWatch.getElapsedTime() + " milliseconds");
	}

	public static void selectionSort(int[] list) {
		for(int i = 0; i < list.length; i++) {
			int currentMin= list[i];
			int currentMinIndex = i;

			for(int j = i + 1; j< list.length; j++ ) {
				if(currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}

		}
	}
}
