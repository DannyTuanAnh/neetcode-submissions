class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();

        for(String str : strs){
            int[] address = new int[26];

            for(char word : str.toCharArray()){
                address[word - 'a']++;
            }

            group.computeIfAbsent(Arrays.toString(address), k -> new ArrayList<>()).add(str);
        }

        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry : group.entrySet()){
            result.add(entry.getValue());
        }

        return result;
    }
}
