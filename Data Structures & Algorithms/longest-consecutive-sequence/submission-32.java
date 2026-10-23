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

                while(set.contains(ele + 1)){
                    count++;
                    ele++;
                }
                
                longest = Math.max(count, longest);
            }
        }

        return longest;
    }
}
