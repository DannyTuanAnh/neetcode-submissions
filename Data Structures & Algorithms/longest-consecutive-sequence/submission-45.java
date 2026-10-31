class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int n: nums){
            numSet.add(n);
        }

        int max = 0;
        // now loop thorugh countMap and see if the next num in this sequence is there
        for(int n: numSet){

            // if n-1 does not exist this is the beginning of a sequence
            if(!numSet.contains(n-1)){
                // beginning of sequence
                // now loop until you find the end
                int curSeq = 1;
                while(numSet.contains(n+1)){
                    curSeq++;
                    n++;
                }
                max = Math.max(max, curSeq);
            } 
        }
        return max;
    }
}
