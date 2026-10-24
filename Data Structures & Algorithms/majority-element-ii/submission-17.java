class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Integer major1 = null;
        Integer major2 = null;

        int count1 = 0;
        int count2 = 0;

        for(int num : nums){
            if(major1 != null && major1 == num){
                count1++;
            } else if(major2 != null && major2 == num){
                count2++;
            } else if(count1 == 0){
                count1 = 1;
                major1 = num;
            } else if(count2 == 0){
                count2 = 1;
                major2 = num;
            } else{
                count1--;
                count2--;
            }
        }

        System.out.println(major1);
        System.out.println(major2);

        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(major1 != null && num == major1){
                count1++;
            }

            if(major2 != null && num == major2){
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();
        if(count1 > nums.length/3){
            result.add(major1);
        }

        if(count2 > nums.length/3){
            result.add(major2);
        }

        
        return result;
    }
}