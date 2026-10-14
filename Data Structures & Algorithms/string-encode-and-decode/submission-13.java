class Solution {

    public String encode(List<String> strs) {
        StringBuilder message = new StringBuilder();

        if (strs.isEmpty()) return message.toString();

        message.append(strs.getFirst());

        for(int i = 1; i < strs.size(); i ++){
            String encode = 'Ê' + strs.get(i);
            message.append(encode);
        }
        
        message.append('Ê');

        return message.toString();

    }

    public List<String> decode(String str) {
        if(str.isEmpty()) return new ArrayList<>();
        
        List<String> result = new ArrayList<>();
        int index = 0;

        StringBuilder temp = new StringBuilder();

        for(int i = 0; i < str.length(); i++){ 
            temp.append(str.charAt(i));
            
            if(str.charAt(i) == 'Ê'){
                temp.deleteCharAt(index);

                result.add(temp.toString());
                
                temp.delete(0, temp.length());

                index = 0;

                continue;
            }

            index++;
        }
        
        return result;
    }
}
