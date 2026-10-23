class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer>[] fre = new ArrayList[nums.length + 1];

        for(int key : map.keySet()){
            int count = map.get(key);

            if(fre[count] == null){
                fre[count] = new ArrayList<>();
            }
                fre[count].add(key);
            
        }

        int[] result = new int[k];
        int index = 0;

        for(int i = fre.length - 1; i > 0; i--){
            if(k <= 0) return result;

            if(fre[i] != null){
                while(!fre[i].isEmpty() && k > 0){
                    result[index] = fre[i].get(fre[i].size() - 1);
                    fre[i].remove(fre[i].size() - 1);
                    index++;
                    k--;
                }
            }
        }

        return result;
    }
}
