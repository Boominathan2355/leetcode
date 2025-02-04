class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        int m=0,c=0;
        while(c<n){
            if(nums[c]!=0){
                nums[m++]=nums[c];
            }
            c++;
        }
        while(m<n){
            nums[m++]=0;
        }
    }
}