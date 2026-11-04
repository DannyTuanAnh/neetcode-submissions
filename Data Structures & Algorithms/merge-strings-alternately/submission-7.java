class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1.length() <= 0) return word2;

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < word1.length(); i++){
            result.append(word1.charAt(i));
            if(i < word2.length()) result.append(word2.charAt(i));
        }

        if(word1.length() < word2.length()) result.append(word2.substring(word1.length()));

        return result.toString();
    }
}