class Solution(object):
    def findLucky(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        from collections import Counter
        freq = Counter(arr)
        lucky_numbers = [key for key, val in freq.items() if key == val]
        return max(lucky_numbers) if lucky_numbers else -1
