class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> sets = new HashSet<>();
        for (int value : nums) {
            if (sets.contains(value)){
                return true;
            }else {
                sets.add(value);
            }
        }
        return false;
    }
}