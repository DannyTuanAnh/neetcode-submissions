class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> fre = new HashMap<>();
        for(int num : nums){
            fre.put(num, fre.getOrDefault(num, 0) + 1);
        }

        int n = nums.length;
        List<Integer>[] arr = new ArrayList[n+1];

        for(int key : fre.keySet()){
            int count = fre.get(key);

            if(arr[count] == null) {
                arr[count] = new ArrayList<>();
            }

            arr[count].add(key);
        }

        int[] result = new int[k];
        int index = 0;

        for(int j = arr.length - 1; j >= 0; j--){
            if(arr[j] != null){
                for(int num : arr[j]){
                    result[index++] = num;
                }
                if (index == k) return result;
            }
        }

        return result;
    }
}
