class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0; // Tracks the farthest index we can reach
        
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) return false; // If we can't reach this index, return false
            reachable = Math.max(reachable, i + nums[i]); // Update max reachable index
            if (reachable >= nums.length - 1) return true; // If we can reach or surpass last index, return true
        }
        
        return true;
    }
}
