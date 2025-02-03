class Solution {
    public boolean isThree(int n) {
        int i,c=0;
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                c++;
            }
            
        }
        if(c==2)
        {
            return true;
        }
        return false;
    }
}