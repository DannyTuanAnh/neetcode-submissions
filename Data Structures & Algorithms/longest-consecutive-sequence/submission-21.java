class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums){
            seen.add(num);
        }
        
        List<Integer> starts = new ArrayList<>();
        int index = 0;
        for(int num : nums){
            if(!seen.contains(num - 1) && seen.contains(num + 1)){
                starts.add(num);
                index++;
            }
        }
        
        int max = 1;
        for (int start : starts) {
            int count = 1;
            while (seen.contains(start + 1)) {
                count++;
                start++;
            }

            if (count > max) max = count;
        }

        return max;
    }
}
