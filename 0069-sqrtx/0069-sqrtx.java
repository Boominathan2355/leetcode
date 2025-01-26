class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        long g =x;
        while(g*g>x){
            g = (g+x/g)/2;
        }
        return(int) g;
    }
}