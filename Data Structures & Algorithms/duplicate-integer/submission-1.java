class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> sets = new HashSet<>();
        for (int value : nums) {
            if (!sets.add(value)){
                return true;
            }
        }
        return false;
    }
}