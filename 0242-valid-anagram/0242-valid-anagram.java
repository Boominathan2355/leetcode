class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        char char1[]  = s.toCharArray();
        char char2[] = t.toCharArray();
        
        Arrays.sort(char1);
        Arrays.sort(char2);
        
        String s1 = new String(char1);
        String s2 = new String(char2);
        
        return s1.equals(s2);

    }
}