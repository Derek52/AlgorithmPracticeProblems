public class BonusFinder {
	public static void main(String[] args) {

		int input[] = {1, 2, 3, 2, 3, 5, 1};
		int output[] = new int[input.length];

		for (int i = 0; i < output.length; i++) {
			output[i] = 1;
		}

		//compare the first input item to the employee on it's right
		if (input[0] > input[1]) {
			output[0] += 1;
		}

		//this is essentially a pointer to the employee to the left of whatever employee we are currently checking the performance of
		int leftEmployee = input[0];

		//this loop checks all employees, except the first and last
		for (int i = 1; i < input.length - 1; i++) {
			if (input[i] > leftEmployee) {
				output[i] += 1;
			}
			if (input[i] > input[i + 1]) {
				output[i] += 1;
			}
			
			//move our "pointer" to the current employee, who is to the left of the next one
			leftEmployee = input[i];
		}

		//compare the final employee to the last leftEmployee
		if (input[input.length-1] > leftEmployee){
			output[input.length-1] += 1;
		}

		//print our output
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}
}
