class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int i,min=nums[0],max=nums[0],j,c=0;
        for(i=1;i<n;i++)
        {
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(i=min;i>0;i--)
        {
            if(max%i==0 && min%i==0)
            {
                return i;
            }
        }
        return 1;
    }
}