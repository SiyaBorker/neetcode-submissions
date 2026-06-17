class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        HashSet<Integer> no=new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(no.contains(nums[i]))
            {
                return true;
            }
            no.add(nums[i]);

        }
        return false;
    }
}