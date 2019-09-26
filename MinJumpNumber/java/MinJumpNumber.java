public class MinJumpNumber {
	public static void main(String[] args) {
		final int[] input = { 3, 2, 1, 2, 1, 2, 3, 4, 1, 2, 1 };

		int index = 0;
		int jumpCount = 0;

		while (index < input.length) {
			if (input.length - input[index] <= index) {
				jumpCount++;
				break;
			}
			if (input[index] == 1) {
				index++;
			} else {
				index = getHighestNumberPos(input, index + 1, index + input[index]);
			}
			jumpCount++;
		}
		System.out.println(jumpCount);
	}

	private static int getHighestNumberPos(int[] subSet, int begin, int end) {
		int highestNumberPos = subSet[begin];

		for (int i = begin + 1; i <= end; i++){
			if (subSet[i] >= highestNumberPos) {
				highestNumberPos = i;
			}
		}
		System.out.println(highestNumberPos);
		return highestNumberPos;
	}

}
