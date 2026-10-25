class Solution {
    public int firstMissingPositive(int[] nums) {
        int min = 1;

        for(int num : nums){
            if(num < 0) continue;

            if(num == min){
                min++;
            }
        }

        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] < 0) continue;

            if(nums[i] == min){
                min++;
            }
        }

        for(int num : nums){
            if(num < 0) continue;

            if(num == min){
                min++;
            }
        }

        return min;
    }
}