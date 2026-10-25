class Solution {
    public int subarraySum(int[] nums, int k) {
        int numsSize = nums.length;

        Map<Integer, Integer> sumFreq = new HashMap<>();
        
        int currentSum = 0;
        int numSubArray = 0;

        sumFreq.put(0, 1);

        for (int num : nums){
            currentSum += num;

            int target = currentSum - k;

            if (sumFreq.containsKey(target)){
                numSubArray += sumFreq.get(target);
            }

            int newSumFreq = 1;
            if (sumFreq.containsKey(currentSum)){
                newSumFreq = sumFreq.get(currentSum) + 1;
            }

            sumFreq.put(currentSum, newSumFreq);
        }

        return numSubArray;
    }
}