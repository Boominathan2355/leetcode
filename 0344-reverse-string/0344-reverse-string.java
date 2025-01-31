class Solution {
    public void reverseString(char[] s) {
      int i =0;
      int a = s.length-1;
     while(i<=a){
        char tm = s[i];
        s[i] = s[a];
        s[a] = tm;
        i++;
        a--;
     }
    }
}