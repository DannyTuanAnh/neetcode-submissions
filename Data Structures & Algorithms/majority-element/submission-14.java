class Solution {
    public int majorityElement(int[] nums) {
    int ele = nums[0];
    int count = 1;

    for(int num : nums){
        if(num == ele){
            count++;
        } else{
            if(count > 1){
                count--;
            } else{
                ele = num;
                count = 1;
            }
        }
    }

    return ele;

    }
}