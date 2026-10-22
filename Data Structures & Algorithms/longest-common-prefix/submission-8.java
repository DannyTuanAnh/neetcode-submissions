class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest = strs[0];

        for(String str : strs){
            while(!str.contains(longest)){
                longest = longest.substring(0, longest.length() - 1);
            }
        }

        return longest;
    }
}