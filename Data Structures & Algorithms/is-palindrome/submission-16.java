class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            if(s.charAt(start) - '0' < 0 || (s.charAt(start) - '0' > 9 && s.charAt(start) - '0' <= 16) ||(s.charAt(start) - 'a' < 0 && s.charAt(start) - 'a' >= -6) || s.charAt(start) > 122){
                start++;

                continue;
            }

            if(s.charAt(end) - '0' < 0 || (s.charAt(end) - '0' > 9 && s.charAt(end) - '0' <= 16) ||(s.charAt(end) - 'a' < 0 && s.charAt(end) - 'a' >= -6) || s.charAt(end) > 122){
                end--;

                continue;
            }

            if(s.charAt(start) - '0' <= 9){
                if(s.charAt(start) != s.charAt(end)) {
                    System.out.println(s.charAt(start));
                    return false;
                }
            } else{
                int i = s.charAt(start) - s.charAt(end);
                if(i == 32 || i == -32 || i == 0) {
                    System.out.println(s.charAt(end));
                    System.out.println(end);
                    System.out.println(s.charAt(start));
                    
                } else{
                    return false;
                }
            }

            start++;
            end--;
        }

        return true;
    }
}
