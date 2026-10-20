class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer, Integer> seen = new HashMap<>();
        seen.put(0, 1);
        int count = 0;
        int sum = 0;
        
        for(int num : nums){
            sum += num;
            if(seen.containsKey(sum - k)){
                count += seen.get(sum - k);
            }

            seen.put(sum, seen.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}