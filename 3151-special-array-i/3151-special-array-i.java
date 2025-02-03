class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n=nums.length;
            int m=nums[0],i;
            int l=nums[0]%2;
            for(i=0;i<n;i++)
            {
                if((i%2==0 && nums[i]%2==l)|| (i%2==1 && nums[i]%2!=l))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }

        return true;
    }
}