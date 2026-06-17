// class Solution {
//     public int[] twoSum(int[] nums, int target)
//     {
//         HashMap <Integer,Integer> a=new HashMap<>();
//         for(int i=1;i<nums.length;i++)
//         {
//             a.put(nums[i],i);
//         }
//         int dif=0;
//         for(int i=0;i<nums.length;i++)
//         {
//            dif=target-nums[i];
//            if(a.contains(dif))
//            {
//             return new int[]{i,a.get(dif)};
//            }
//         }
//         return new int[]{};
//     }
// }
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