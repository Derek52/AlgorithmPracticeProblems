public class ClimbingStairsTest {
	public static void main(String[] args) {

		System.out.println("Input:  4");
		System.out.println("Expected Output: 5");

		int input = 4;
		int expectedAnswer = 5;
		int answer = ClimbingStairs.solve(input);

		System.out.println("Answer:  " + answer);
		if (answer == expectedAnswer){
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

			
	}
}
