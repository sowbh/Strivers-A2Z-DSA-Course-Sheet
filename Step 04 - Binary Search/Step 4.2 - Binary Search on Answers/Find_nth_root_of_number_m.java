/*You are given two positive integers 'n' and 'm'. You have to return the 'nth' root of 'm', i.e. 'm(1/n)'. 
If the 'nth root is not an integer, return -1.

Note:
'nth' root of an integer 'm' is a number, which, when raised to the power 'n', gives 'm' as a result.

Example:
Input: ‘n’ = 3, ‘m’ = 27

Output: 3

Explanation: 
3rd Root of 27 is 3, as (3)^3 equals 27.     */
public class Solution {
    public static int NthRoot(int n, int m) {
        int low = 1, high = m;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midN = func(mid, n, m);
            if (midN == 0) {
                low = mid + 1;
            } else if (midN == 1) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int func(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= mid;
            if (ans > m) {
                return 1;
            }
        }
        if (ans == m) {
            return 2;
        }
        return 0;
    }
}
