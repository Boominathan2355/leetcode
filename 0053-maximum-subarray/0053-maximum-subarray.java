class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];  // Initialize max sum as first element
        int currentSum = nums[0];  // Running sum

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]); // Either start new or extend
            maxSum = Math.max(maxSum, currentSum); // Update max sum
        }
        
        return maxSum;
    }
}
