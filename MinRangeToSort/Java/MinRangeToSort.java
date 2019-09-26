public class MinRangeToSort {
	public static void main(String[] args) {
		int input[] = {1, 7, 9, 5, 7, 8, 10};

		int leftMin = 0;
		int rightMin = input.length - 1;

		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] > input[i + 1]) {
				leftMin = i;
				break;
			}
		}

		for (int i = input.length - 1; i > 0; i--) {
			if (input[i] < input[i - 1]) {
				rightMin = i;
				break;
			}
		}

		System.out.println("[" + leftMin + ", " + rightMin + "]");
	}
}
