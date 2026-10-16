class Solution {
        public static int[] productExceptSelf(int[] nums) {
        int l = nums.length;

        int[] ans = new int[l];

        int prod = 1;
        for(int i = l - 1; i >= 0; i--){
            ans[i] = prod;
            prod *= nums[i];
        }
        
        prod = nums[0];
        for(int j = 1; j < l; j++){
            ans[j] *= prod;
            prod *= nums[j];
        }
        
        return ans;
    }
}  
