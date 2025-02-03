class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.matches("[A-Z]+"))
        {
            return true;
        }
        else if(word.matches("[a-z]+"))
        {
            return true;
        }
        else if(word.matches ("[A-Z][a-z]+"))
        {
            return true;
        }
        return false;
    }
}