class Solution {
    public boolean isPalindrome(String s) {
        s =s.toLowerCase().replaceAll("[\\s\\p{Punct}]","");
        String rev ="";
        for (int i = s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        return s.equals(rev);

    }
}