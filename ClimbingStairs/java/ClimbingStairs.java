public class ClimbingStairs {
	public static void main(String[] args) {

		int stairCase = 18;

		System.out.println("Unique number of ways to climb staircase = " + countWaysToTop(stairCase));
			
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
