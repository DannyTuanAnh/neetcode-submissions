class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;

        StringBuilder alter = new StringBuilder();
        while(i < word1.length() && j < word2.length()){
            alter.append(word1.charAt(i));
            alter.append(word2.charAt(j));

            i++;
            j++;
        }

        alter.append(word1.substring(i));
        alter.append(word2.substring(j));
        
        return alter.toString();
    }
}