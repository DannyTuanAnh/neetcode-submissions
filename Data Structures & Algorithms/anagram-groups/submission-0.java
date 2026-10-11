class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, List<String>> group = new HashMap<>();

        for (String word : strs) {
            int[] chars = new int[26];
            for (int i = 0; i < word.length(); i++) {
                chars[word.charAt(i) - 'a']++;
            }

            int hashCode = Arrays.hashCode(chars);
            group.computeIfAbsent(hashCode, k -> new ArrayList<String>()).add(word);
        }

        return new ArrayList<>(group.values());
    }
}
