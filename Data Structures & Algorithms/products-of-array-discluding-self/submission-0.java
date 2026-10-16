class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int l = nums.length;

        int[] store = new int[l + 2];
        store[0] = 1;
        store[l + 1] = 1;

        System.arraycopy(nums, 0, store, 1, nums.length);

        int[] products = new int[l];
        int prefix = 1;
        for(int j = 1; j < store.length - 1; j++){
            prefix = prefix * store[j - 1];
            products[j - 1] = prefix;
        }

        int suffix = 1;
        for(int k = store.length - 2; k > 0; k--){
            suffix = suffix * store[k + 1];
            products[k - 1] = products[k - 1] * suffix;
        }

        return products;
    }
}  
