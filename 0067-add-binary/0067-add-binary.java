class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        // Iterate from the last digit of both strings
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0'; // Convert '1'/'0' to int
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 2); // Append binary digit
            carry = sum / 2; // Update carry for next addition
        }

        return result.reverse().toString(); // Reverse to get the correct order
    }
}
