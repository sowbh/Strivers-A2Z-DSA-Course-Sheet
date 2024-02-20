/* 
Problem Statement: Given a number n, reverse the number and print it.
Example:
Input: n = 7789
Output: 9877
Explanation: The reverse of 7789 is 9877 */
public class Solution {
    public int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            if ((rev > Integer.MAX_VALUE / 10) || (rev < Integer.MIN_VALUE / 10)) {
                return 0;
            }

            rev = rev * 10 + digit;
            n = n / 10;
        }

        return rev;
    }
}
