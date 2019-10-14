public class ShiftedString {

	public boolean solve(String A, String B) {

		//if the strings aren't the same length, it's an automatic fail
		if (A.length() != B.length()) {
			return false;
		}
		
		//optionally, we could do some character searching here. We could do something like put every character of one of the strings
		//and put it in a hash table. Then we could loop over the other string, and make sure each character in it appears in the first one.
		//i.e. "abcd" can not be shifted to "efgh".
		//I'm not sure if it's more performant to perform this check or not though, so I've skipped it, and gone right to shifting one of the strings

		//shift the string one letter at a time and see if we hit a match
		for (int i = 0; i < A.length(); i++) {
			String tempString = A.substring(i, A.length()) + A.substring(0, i);
			if (tempString.equals(B)) {
				return true;
			}
			System.out.println(tempString);
		}
		return false;
	}
}
