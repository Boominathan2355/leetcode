import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        result.add(new ArrayList<>(tempList)); // Add current subset to result
        
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]); // Include nums[i]
            backtrack(result, tempList, nums, i + 1); // Recur with next index
            tempList.remove(tempList.size() - 1); // Backtrack (remove last added element)
        }
    }
}
