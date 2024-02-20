/*Problem statement
You are given an integer ’n’.

Your task is to return a sorted array (in increasing order) containing 
all the factorial numbers which are less than or equal to ‘n’.

The factorial number is a factorial of a positive integer, like 24 is a factorial number, as it is a factorial of 4.

Note:
In the output, you will see the array returned by you.
Example:
Input: ‘n’ = 7

Output: 1 2 6

Explanation: Factorial numbers less than or equal to ‘7’ are ‘1’, ‘2’, and ‘6’. */
import java.util.List;
import java.util.ArrayList;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
        long result = 1l, cnt = 1l;
        List< Long > ans = new ArrayList<>();

        while(result <= n / cnt) {
           
            result *= cnt;
            cnt++;            
            ans.add(result);
        }

        return ans;
    }
}