/*********************************************************************************
 * (Bubble sort) Write a sort method that uses the bubble-sort algorithm. 		 *
 * The bubblesort algorithm makes several passes through the array. On each pass,* 
 * successive neighboring pairs are compared. If a pair is not in order, 		 *
 * its values are swapped; otherwise, the values remain unchanged. 				 *
 * The technique is called a bubble sort or sinking								 *
 *  sort because the smaller values gradually 									 *
 * “bubble” their way to the top and the larger values “sink” to the bottom. 	 *
 * Write a test program that reads in ten double numbers, 						 *
 * invokes the method, and displays the sorted numbers.                          *
 *********************************************************************************/

public class BubbleSort7_18 {
	public static void main(String args[]) 
    { 
        int arr[] = { 4, 74, 95, 1, 33, 15, 90 }; 
        int n = arr.length; 
        bubbleSort(arr, n); 
        System.out.println("Sorted array: "); 
        printArray(arr, n); 
        
     
    }
	public static void bubbleSort(int arr[], int n) {

		int i, j, temp;
		boolean swapped;

		for (i = 0; i < n - 1; i++) {

			swapped = false;
			for (j = 0; j < n - i - 1; j++ ) {
				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false)
				break;
		}
	}
	public static void printArray(int arr[], int size) {
		
		int i; 
        for (i = 0; i < size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
	}
}