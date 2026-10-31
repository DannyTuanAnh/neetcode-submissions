class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums){
            seen.add(num);
        }

        List<Integer> arr = new ArrayList<>();
        for(int num : nums){
            if(!seen.contains(num - 1)){
                arr.add(num);
            }
        }

        int longest = 0;
        for(int  ele : arr){
            int count = 1;

            while(seen.contains(ele + 1)){
                ele += 1;
                count ++;
            }

            if(count > longest) longest = count;
        }

        return longest;
    }
}
