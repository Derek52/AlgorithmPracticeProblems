public class ClimbingStairs {


	static int solve(int input) {
		return countWaysToTop(input);
	}

	static int getFibonacci(int num) {
		if (num <= 1) {
			return num;
		}
		return getFibonacci(num - 1) + getFibonacci(num -2);
	}

	static int countWaysToTop(int stairCaseSize) {
		return (getFibonacci(stairCaseSize + 1));
	}
}
