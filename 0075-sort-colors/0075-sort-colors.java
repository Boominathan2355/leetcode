class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1]= nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(nums));
    }
}