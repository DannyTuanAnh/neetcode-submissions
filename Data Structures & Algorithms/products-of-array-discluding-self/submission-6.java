class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int prod = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            result[i] = prod;
            prod *= nums[i];
        }

        prod = nums[0];
        for(int j = 1; j < nums.length; j++){
            result[j] *= prod;
            prod *= nums[j];
        }

        return result;
    }
}  
