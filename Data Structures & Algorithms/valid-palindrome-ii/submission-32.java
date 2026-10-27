class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() < 3) return true;

        int l = 0;
        int r = s.length() - 1;

        while(l < r){
            if ((s.charAt(l) - 'a') != (s.charAt(r) - 'a')){
                if(isPalindrome(s, l + 1, r) == false && isPalindrome(s, l, r - 1) == false) return false;
            }

            l++;
            r--;
        }

        return true;
    }

    public boolean isPalindrome(String s, int l, int r){
        while(l < r){
            if ((s.charAt(l) - 'a') != (s.charAt(r) - 'a')){
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}