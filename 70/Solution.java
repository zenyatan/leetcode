class Solution {
    public int climbStairs(int n) {
        return climbing(n);
    }

    public int climbing(int n) {
        int result = 0;
        
        if (n <= 2) {
            result = n;
        } else {
            result = (climbing(n - 1) + climbing (n - 2));
        }

        return result;
    }
}
