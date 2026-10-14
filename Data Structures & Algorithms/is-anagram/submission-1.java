class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ele : s.toCharArray()){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }

        for (char ele : t.toCharArray()){
            if (!map.containsKey(ele)) {
                return false;
            }

            map.put(ele, map.get(ele)-1);
            if (map.get(ele) == 0){
                map.remove(ele);
            }

        }
        return map.isEmpty();

    }
}
