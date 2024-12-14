class Solution(object):
    def maximumBeauty(self, nums, k):
        nums.sort()
        n = len(nums)
        l = 0
        max_b = 0
        for right in range(n):
            while nums[right] - nums[l] > 2 * k:
                l += 1
            max_b = max(max_b, right - l + 1)
        return max_b