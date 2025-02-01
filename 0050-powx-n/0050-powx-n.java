class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        
        long exp = n; // Convert to long to handle Integer.MIN_VALUE edge case
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        double result = 1.0;
        while (exp > 0) {
            if (exp % 2 == 1) {  // If exponent is odd, multiply x
                result *= x;
            }
            x *= x;  // Square x
            exp /= 2; // Reduce exponent
        }
        
        return result;
    }
}
