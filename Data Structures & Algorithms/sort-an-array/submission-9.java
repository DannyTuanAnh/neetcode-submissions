class Solution {
    public int[] sortArray(int[] nums){
        int min = nums[0];
        int max = nums[0];

        for(int num: nums){
            min = Math.min(num, min);
            max = Math.max(num, max);
        }

        int[] couting = new int[max - min + 1];
        for(int num: nums){
            couting[num - min]++;
        }

        int index = 0;
        for(int i = 0; i < couting.length; i++){
            while(couting[i] > 0){
                nums[index++] = i + min;
                couting[i]--;
            }
        }

        return nums;
    }

}