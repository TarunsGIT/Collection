package in.co.array;

public class SecondGreatestInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int greatest = arr[0];
		int secondGreatest = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > greatest) {

				secondGreatest = greatest;
				greatest = arr[i];
			} else if (arr[i] < greatest && arr[i] > secondGreatest) {
				secondGreatest = arr[i];
			}

		}
		System.out.println(secondGreatest);
	}

}
