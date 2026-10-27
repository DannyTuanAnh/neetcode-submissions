class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() < 3) return true;

        int l = 0, r = s.length() - 1;

        while(l < r){
            if ((s.charAt(l) - 'a') != (s.charAt(r) - 'a')){
                return isPalindrome(s, l + 1, r) || isPalindrome(s, l, r - 1);
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