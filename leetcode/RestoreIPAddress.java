class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ipList = new ArrayList<String>();
        int length = s.length();
        if (length < 4 || length > 12){
            return ipList;
        }
        
        for (int i = 0; i < length - 2; i++) {
            if (i > 3) {//no segment can be longer than 3 digits
                continue;
            }
            for (int j = i + 1; j < length - 1; j++) {
                if (j - i > 3) {
                    continue;
                }
                for (int k = j + 1; k < length; k++) {
                    if (k - j > 3) {
                        continue;
                        }
                    if (length - k > 3) {
                        continue;    
                        }
                            
                    String substring1 = s.substring(0, i);
                    String substring2 = s.substring(i, j);
                    String substring3 = s.substring(j, k);
                    String substring4 = s.substring(k, length);
                            
                    if (isValid(substring1) && isValid(substring2) && isValid(substring3) && isValid(substring4)) {
                        ipList.add(substring1 + "." + substring2 + "." + substring3 + "." + substring4);
                        }
                }
                    
            }
        }
        
        
        return ipList;
    }
    
    public boolean isValid(String segment) {
        int length = segment.length();
        if (length <= 0 || length > 3) {
            return false;
        }
        
        if (length == 1) {
            return true;
        } else if (length == 2 && segment.charAt(0) != '0') {
            return true;
        } else { //segment of length 3
            if(segment.charAt(0) == '1') {
                return true;
            } else if (segment.charAt(0) == '2')  {
                //this checks to see if our second digit is 0-4. Making sure our number is lower than 250
                if ("01234".contains(String.valueOf(segment.charAt(1)))) {
                    return true;
                } else if (segment.charAt(1) == '5') {
                    //if the second digit was a 5, we have to make sure our 3rd digit is 0-5, to make sure we don't go over our 255 limit
                    if ("012345".contains(String.valueOf(segment.charAt(2)))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
} 
