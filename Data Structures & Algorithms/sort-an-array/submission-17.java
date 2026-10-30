class Solution {
    public int[] sortArray(int[] nums){
       int min = nums[0];
       int max = nums[0];
       
       for(int num : nums){
        min = Math.min(min, num);
        max = Math.max(max, num);
       }

       int[] arr = new int[max - min + 1];

       for(int num : nums){
        int index = num - min;
        arr[index] ++;
       }

        int[] result = new int[nums.length];
        int k = 0;

       for(int a = 0; a < arr.length; a++) {
        while(arr[a] > 0){
            result[k] = a + min;
            arr[a]--;
            k++;
        }
       }

       return result;
    }

}