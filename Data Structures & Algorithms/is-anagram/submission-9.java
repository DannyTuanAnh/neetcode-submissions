class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() > t.length()) return false;
        
        int[] store = new int[26];

        for(char word : s.toCharArray()){
            store[word - 'a']++;
        }

        for(char word : t.toCharArray()){
            if(store[word - 'a'] <= 0) return false;

            store[word - 'a']--;
        }

        return true;
    }
}
