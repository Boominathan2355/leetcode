class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int i;
        HashSet <Integer> H=new HashSet<>();
        List <Integer> l=new ArrayList<>();
        for(i=0;i<n;i++)
        {
            H.add(nums[i]);
        }
        for(i=1;i<=n;i++)
        {
            if(H.contains(i))
            {
                continue;
            }
            else
            {
               l.add(i);
            }
        }
        return l;
    }
}