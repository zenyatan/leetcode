class Solution {
    public int lengthOfLastWord(String s) {
        char chars[] = s.toCharArray();

        int
            lengthOfLastWord = 0,
            lastIndex = chars.length - 1,
            i = lastIndex;

        while (chars[i] == ' ') {
            i--;
        }

        while ((i >= 0) && (chars[i] != ' ')) {
            lengthOfLastWord++; 
            i--;
        }
        
        return lengthOfLastWord; 
    }
}