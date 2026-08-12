class Solution {
    public boolean isPalindrome(int x) {
        boolean isPal = true;
        String strx = String.valueOf(x);
        char[] chars = strx.toCharArray();
        int
            end = chars.length,
            left = 0,
            right = end - 1;

        if (x < 0) {
            isPal = false;
        }

        for (int i = 0; i < (end / 2); i++) {
            if (chars[left] == chars[right]) {
                left++;
                right--;
            } else {
                isPal = false;
            }
        }

        return isPal;
    }
}