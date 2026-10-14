class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int[] result = new int[k];

        for (int i=0; i<k; i++) {
            int maxValue = Integer.MIN_VALUE;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                if (entry.getValue() > maxValue) {
                    maxValue = entry.getValue();
                    result[i]= entry.getKey();
                }
            }
            map.remove(result[i]);
        }
        return result;
    }
}
