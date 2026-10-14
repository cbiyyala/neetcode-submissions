class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String ele : strs){
            char[] chars = ele.toCharArray();
            Arrays.sort(chars);
            String sortedVal= new String(chars);
            map.computeIfAbsent(sortedVal, k -> new ArrayList<>()).add(ele);
        }

        // System.out.println(map);
        List<List<String>> ans = new ArrayList<>(map.values());
        return ans;
        
    }
}
