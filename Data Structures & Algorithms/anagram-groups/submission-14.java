class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> myMap = new HashMap<>();

        for(String str : strs){
            int[] key = new int[26];

            for(char word : str.toCharArray()){
                key[word - 'a']++;
            }

            myMap.computeIfAbsent(Arrays.toString(key), k -> new ArrayList<>()).add(str);
        }



        return new ArrayList<>(myMap.values());
    }
}
