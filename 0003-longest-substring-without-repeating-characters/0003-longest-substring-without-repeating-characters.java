class Solution {
    public int lengthOfLongestSubstring(String s) {
        String temp = "";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            String str = Character.toString(s.charAt(i));
            if (temp.contains(str)) {
                temp = temp.substring(temp.indexOf(str) + 1);
            }
            temp += s.charAt(i);
            maxLength = Math.max(maxLength, temp.length());
        }
        return maxLength;
    }
}
