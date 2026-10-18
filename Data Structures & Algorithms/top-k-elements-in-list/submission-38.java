class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int num : nums){
           count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] fre = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if(fre[entry.getValue()] == null){
                fre[entry.getValue()] = new ArrayList<>();
            }
            
            fre[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        for (int i = fre.length - 1; i >= 0; i--) {
            if (k == 0) return result;

            while(k > 0 && fre[i] != null){
                if(fre[i].isEmpty()) break;

                result[k-1] = fre[i].removeLast(); 
                k--;
            }
        }

        return result;
    }
}
