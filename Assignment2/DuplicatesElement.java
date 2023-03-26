
public class DuplicatesElement {

	public static void main(String[] args) {
		// Initialize array
		int[] arr = { 1, 2, 3, 4, 2, 7, 8, 8, 3, 3 };
		int i, j, count;
		// Sort array
		for (i = 0; i < arr.length; i++) {
			for (j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;

				}
			}
		}

		// Searches for duplicate element

		for (i = 0; i < arr.length; i++) {
			count = 1;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				} else {
					break;
				}
			}

			i = j - 1;
			if (count > 1) {
				System.out.println("Element " + arr[i] + " is repeated " + count + " times");
			}

		}
	}
}
