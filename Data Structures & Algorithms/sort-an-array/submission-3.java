class Solution {
       private void heapify(int[] nums, int i, int heapSize){
        int root = i;
        int left = root * 2 + 1;
        int right = root * 2 + 2;

        if (left < heapSize && nums[left] < nums[root]){
            root = left;
        }
        if (right < heapSize && nums[right] < nums[root]){
            root = right;
        }

        if (root != i) {
            int temp = nums[i];
            nums[i] = nums[root];
            nums[root] = temp;

            heapify(nums, root, heapSize);
        }
    }

    public int[] sortArray(int[] nums) {
        int n = nums.length;

        for(int i =  n/2 - 1; i >= 0; i--){
            heapify(nums, i, n);
        }

        int[] result = new int[n];
        int i = 0;

        int right = n;

        while(right > 0){
            result[i++] = nums[0];

            nums[0] = nums[right - 1];

            right--;
            

            heapify(nums, 0, right);
        }

        return result;
    }

}