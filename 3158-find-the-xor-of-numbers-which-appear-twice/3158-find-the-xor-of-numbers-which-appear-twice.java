class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> H= new HashSet <>();
        int i,s=0;
        int n=nums.length;
        for(i=0;i<n;i++)
        {
            if(H.contains(nums[i]))
            {
                s=s^nums[i];
            }
            else
            {
                H.add(nums[i]);
            }
        }
        return s;
    }
}