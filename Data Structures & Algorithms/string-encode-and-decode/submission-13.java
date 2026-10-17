class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String value : strs){
            sb.append(value.length());
            sb.append("#");
            sb.append(value);
        }
        System.out.println(sb.toString());
        return (sb.toString());
        
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;

        while (i< str.length()){
            int arrow = str.indexOf('#',i);
            int strLen = Integer.valueOf(str.substring(i,arrow));
            int start = arrow + 1;
            int end = start + strLen;
            decoded.add(str.substring(start,end));
            i=end;
        }
        return decoded;
    }
}
