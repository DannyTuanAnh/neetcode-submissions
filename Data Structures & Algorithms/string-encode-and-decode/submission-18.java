class Solution {

    public String encode(List<String> strs) {
        StringBuilder message = new StringBuilder();

        if (strs.isEmpty()) return message.toString();

        for(String str : strs){
            message.append(str.length());
            message.append("#");
            message.append(str);
        }

        return message.toString();

    }

    public List<String> decode(String str) {
        if(str.isEmpty()) return new ArrayList<>();

        List<String> result = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int delimiter = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, delimiter));

            int start = delimiter + 1;

            i = start + length;
            
            String word = str.substring(start, i);
            result.add(word);
        }

        return result;
    }
}
