import java.util.ArrayList;
public class SquaresInRangeTest {
	public static void main(String[] args) {
		SquaresInRange squaresInRange= new SquaresInRange();
		ArrayList<Integer> answers = squaresInRange.solve(1, 100);

		for (int answer : answers) {
			System.out.println(answer);
		}

	}
}
