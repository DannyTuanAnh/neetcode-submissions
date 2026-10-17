class Solution {
    public int[] sortArray(int[] nums){
        int max = nums[0];
        int min = nums[0];

        for(int i = 1; i < nums.length; i ++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        int[] counting = new int[max - min + 1];
        for(int num : nums){
            counting[num - min]++;
        }

        int index = 0;
        for(int i = 0; i < counting.length; i++){
            while(counting[i] > 0){
                nums[index] = i + min;
                counting[i]--;
                index++;
            }
        }

        return nums;
    }

}