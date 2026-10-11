class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer, Integer> seen = new HashMap<>();

        for(int num : nums){
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }

        int res = 0;
        for(Map.Entry<Integer, Integer>  entry : seen.entrySet()){
            
            if (entry.getValue() >= (double) nums.length/2){
                res = entry.getKey();
            }
        }

        return res; 
    }
}