class Solution {
    public boolean hasDuplicate(int[] nums) {
        // HashSet<Integer> seen = new HashSet<>();

        // int n = nums.length;
        // for (int i = 0; i < n; i++){
        //     if (seen.contains(nums[i]))
        //         return true;
            
        //     seen.add(nums[i]);
        // }

        // return false;

        Set<Integer> set = new HashSet<>();

        for (int n: nums) {
            if (!set.add(n)) return true;
        }
        return false;
    }
}