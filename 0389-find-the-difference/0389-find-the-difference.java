class Solution {
    public char findTheDifference(String s, String t) {
        char r=0;
       for(char c:s.toCharArray())
         r^=c;
       for(char d:t.toCharArray())
        r^=d;
       return r;
    }
}