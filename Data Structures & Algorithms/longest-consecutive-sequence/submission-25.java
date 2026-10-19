class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums){
            seen.add(num);
        }

        int max = 0;
        for (int num : seen) {
            if (seen.contains(num - 1)){
                continue;
            }

            int count = 1;
            while (seen.contains(++num)) {
                count++;
            }

            if (count > max) max = count;
        }

        return max;
    }
}
