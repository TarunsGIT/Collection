package in.co.array;

public class SmallestInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 0 };
		int smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}

		}
		System.out.println(smallest);
	}

}
