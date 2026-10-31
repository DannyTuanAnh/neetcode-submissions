class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for(int num : nums){
            myMap.put(num, myMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] arr = new List[nums.length + 1];

        for(Map.Entry<Integer, Integer> entry : myMap.entrySet()){
            if(arr[entry.getValue()] == null){
                arr[entry.getValue()] = new ArrayList<>();
            }

            arr[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] != null){
                while(k > 0 && !arr[i].isEmpty()){
                    result[k - 1] = arr[i].remove(arr[i].size() - 1);
                    k--;
                }
            }
        }

        return result;
    }
}
