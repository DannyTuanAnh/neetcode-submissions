class Solution {
    public int majorityElement(int[] nums) {
        int majo = nums[0];
        int fre = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == majo){
                fre++;
            } else{
                if(fre > 0){
                    fre--;
                } else{
                    fre = 1;
                    majo = nums[i];
                }
            }
        }

        return majo;
    }
}