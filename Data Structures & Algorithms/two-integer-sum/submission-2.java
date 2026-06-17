
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> a = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (a.containsKey(dif)) {
                return new int[]{a.get(dif), i};
            }
            a.put(nums[i], i);
        }
        return new int[]{};
    }
}