class Solution {
    public int lengthOfLastWord(String s) {
        char chars[] = s.toCharArray();

        int
            lengthOfLastWord = 0,
            end = chars.length - 1,
            ptr = 0;

        for (int i = end; i >= 0; i--) {
            if (chars[i] == ' ') {
                continue;
            } else {
                ptr = i;
                lengthOfLastWord++;
                i = -1;
            }
        }

        while (chars[ptr-1] != ' ') {
            lengthOfLastWord++;
            ptr--;
        }
        
        return lengthOfLastWord; 
    }
}