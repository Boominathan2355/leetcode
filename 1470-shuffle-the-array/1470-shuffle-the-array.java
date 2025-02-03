class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i,j=0;
        int n1[]=new int[n];
        int n2[]=new int[n];
        for(i=0;i<n;i++)
        {
            n1[i]=nums[i];
        }
        for(i=n;i<n+n;i++)
        {
            n2[j]=nums[i];
            j++;
        }
        j=0;
        for(i=0;i<n+n-1;i=i+2)
        {
            nums[i]=n1[j];
            nums[i+1]=n2[j];
            j++;

        }
        return nums;
    }
}