class Solution {
    public String mergeAlternately(String word1, String word2) {
        int index1 = 0, index2 = 0;
        char[] alter = new char[word1.length() + word2.length()];
        for(int i = 0; i < alter.length; i++){
            if(i % 2 == 0){
                if(index1 < word1.length()){
                    alter[i] = word1.charAt(index1);
                    index1++;
                } else{
                    alter[i] = word2.charAt(index2);
                    index2++;
                }
            } else{
                if(index2 < word2.length()){
                    alter[i] = word2.charAt(index2);
                    index2++;
                } else{
                    alter[i] = word1.charAt(index1);
                    index1++;
                }
            }
        }

        return new String(alter);
        
    }
}