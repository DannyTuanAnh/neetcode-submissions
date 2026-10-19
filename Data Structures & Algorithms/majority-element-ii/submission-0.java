class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;

        Integer candidate1 = null;
        Integer candidate2 = null;

        int count1 = 0;
        int count2 = 0;

        for(int num : nums){
            if(candidate1 != null && candidate1 == num){
                count1++;
                
                continue;
            }

            if(candidate2 != null && candidate2 == num){
                count2++;
                
                continue;
            }

            if (candidate1 == null || count1 == 0){
                candidate1 = num;
                count1 = 1;

                continue;
            }

            if(candidate2 == null || count2 == 0){
                candidate2 = num;
                count2 = 1;

                continue;
            }
            
            System.out.println(num);
            System.out.println(candidate1);
            System.out.println(candidate2);
            System.out.println(count1);
            System.out.println(count2);

            count1--;
            count2--;
        }

        List<Integer> result = new ArrayList<>();

        count1 = 0;
        count2 = 0;
        for(int num : nums){
            
            if(candidate1 != null && candidate1 == num){
                count1++;
            }

            if(candidate2 != null && candidate2 == num){
                count2++;
            }
        }

        if(count1 > n){
            result.add(candidate1);
        }

        if(count2 > n){
            result.add(candidate2);
        }

        return result;
    }
}