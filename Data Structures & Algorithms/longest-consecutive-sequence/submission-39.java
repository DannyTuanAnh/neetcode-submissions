class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int longest = 0;
        for(int ele : set){
            if(!set.contains(ele - 1)){
                int count = 1;
                int current = ele;

                while(set.contains(current + 1)){
                    count++;
                    current++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
