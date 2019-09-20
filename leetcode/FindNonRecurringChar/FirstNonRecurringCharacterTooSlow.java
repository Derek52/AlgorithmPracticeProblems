public class FirstNonRecurringCharacterTooSlow {
	public static void main(String[] args) {

		String input = "loveleetcode";
		System.out.println(findNonRecurringChar(input);
	}

	public static int findNonRecurringChar(String s) {

		//special cases
		if (s.length() == 1) {
			return 0;
		} else if (s.length() == 2) {
			if (s.charAt(0) == s.charAt(1)) {
				return -1;
			} else {
				return 0;
			}
		}


		for (int i = 0; i < s.length(); i++) {
			String sub1 = s.substring(0, i);
			String sub2 = s.substring(i+1);
			if (!sub1.contains(String.valueOf(s.charAt(i)))) {
				if (!sub2.contains(String.valueOf(s.charAt(i)))) {
					System.out.println(s.charAt(i));
					System.out.println(i);
					return i;
				}
			}
		}

		//if we haven't returned yet, there is no non-recurring character, so return -1
		return -1;
	}
}
