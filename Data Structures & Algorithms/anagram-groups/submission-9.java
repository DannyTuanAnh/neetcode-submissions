class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();

        for(String str : strs){
            int[] key = new int[26];

            for(char word : str.toCharArray()){
                key[word - 'a']--;
            }

            group.computeIfAbsent(Arrays.toString(key), k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(group.values());
    }
}
