class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        List<Integer> starts = new ArrayList<>();
        for(Integer s : set.toArray(new Integer[0])){
            if(!set.contains(s - 1)) starts.add(s);
        }

        int longest = 0;
        for(int sta : starts.toArray(new Integer[0])){
            int count = 1;
            while(set.contains(sta + 1)){
                count++;
                sta++;
            }

            if(count > longest) longest = count;
        }

        return longest;
    }
}
