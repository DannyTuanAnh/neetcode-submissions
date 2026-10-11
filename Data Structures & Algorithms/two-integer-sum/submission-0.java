class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> seen = new HashMap<>();

        int l = nums.length;
        for(int i = 0; i < l; i++){
            Integer idxV = seen.get(nums[i]);
            if (idxV != null) return new int[]{idxV,i};
            
            int composite = target - nums[i];
            seen.put(composite, i);
        }
        
        return new int[]{};
    }
}
