class Solution {
    public int firstUniqChar(String s) {
        
        if (s.length() == 1) {
            return 0;
        } else if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                return -1;
            } else {
                return 0;
            }
        }
        
        char[] seenChars = new char[27];
        int seenCharsIndex = 0;
        
        for (int i = 0; i < s.length(); i++) {
            boolean shouldSearch = true;
            boolean foundMatch = false;
            for (char c : seenChars) {
                if (c == s.charAt(i)) {
                    shouldSearch = false;
                    break;
                }
            }
            
            if (shouldSearch) {
                for (int j = i+1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        seenChars[seenCharsIndex] = s.charAt(i);
                        seenCharsIndex++;
                        foundMatch = true;
                        break;
                    }
                }
            
                if (foundMatch == false) {
                    return i;
                }
            }
        }
        
        return -1;
    }
}
