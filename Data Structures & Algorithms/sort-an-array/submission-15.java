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
            arr[index]++;
       }

        int[] result = new int[nums.length];
        int addr = 0;
       for(int i = 0; i < arr.length; i++){
            while(arr[i]>0){
                result[addr] = i + min;
                arr[i]--;
                addr++;
            }
       }

       return result;
    }

}