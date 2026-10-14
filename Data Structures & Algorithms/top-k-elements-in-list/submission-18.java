class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> fre = new HashMap<>();
        for(int num : nums){
            fre.put(num, fre.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> arr = new ArrayList<>();

        for(int i = 0; i <= nums.length; i++){
            arr.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> entry : fre.entrySet()){
            if(arr.get(entry.getValue()) == null) {
                List<Integer> element = arr.get(entry.getValue());
                element = new ArrayList<>();
            }

            arr.get(entry.getValue()).add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for(int j = arr.size() - 1; j >= 0; j--){

            if(index >= k ) break;

            int last = arr.get(j).size() - 1;

            while(index < k && last >= 0){
                result[index] = arr.get(j).get(last);
                index++;
                last--;
            }
        }

        return result;
    }
}
