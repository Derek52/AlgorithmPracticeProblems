import java.lang.Math;
import java.util.ArrayList;
public class SquaresInRange {

	public ArrayList<Integer> solve(int n, int m) {
		ArrayList<Integer> perfectSquares = new ArrayList<Integer>();
		for (int i = n; i <= m; i++) {
			double squareRoot = Math.sqrt(i);
			//if the double cast to an integer, is still equal to the double, we have a perfect square
			if ((int)squareRoot == squareRoot) {
				perfectSquares.add(i);
			}
		}
		return perfectSquares;
	}
}
