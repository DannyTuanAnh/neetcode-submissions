class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer, Integer> seen = new HashMap<>();

        seen.put(0,1);
       int sum = 0;
       int count = 0;

       for(int num : nums){
        sum += num;

        if(seen.containsKey(sum - k)){
            count += seen.get(sum - k);
        }
        
        seen.merge(sum, 1, (oldVal, newVal) -> oldVal + newVal);
       }

       return count;
    }
}