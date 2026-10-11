class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

       int[] fre_map = new int[26];
       int l = s.length();
       for (int cs = 0; cs < l; cs++){
            fre_map[s.charAt(cs) - 'a']++;
       }
       
       for (int ct = 0; ct < l; ct++){
           int idx = t.charAt(ct) - 'a';
           
           if (fre_map[idx] <= 0) return false;
           fre_map[idx]--;
       }

        return true;
    }
}
