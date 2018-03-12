package in.co.array;

public class SecondSmallestInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		/*
		 * int smallest = arr[0]; int secondSmallest = 0;
		 */
		int smallest;
		int secondSmallest;

		smallest = secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];

			} else if (arr[i] < secondSmallest && arr[i] != smallest) {
				secondSmallest = arr[i];

			}

		}
		System.out.println("SMALLEST :" + smallest);
		System.out.println("SECOND SMALLEST :" + secondSmallest);
		
	}

}
