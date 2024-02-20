/*Problem statement
You are given an integer ‘n’.

Your task is to return an array containing integers from ‘n’ to ‘1’ (in decreasing order) without using loops.

Note:
In the output, you will see the array returned by you.
Example:
Input: ‘n’ = 5

Output: 5 4 3 2 1  */
public class Solution
{
    public static void recursiveFunction(int x, int []ans) {
        if(x == 0) {
            return;
        }
        ans[ans.length - x] = x;
        recursiveFunction(x - 1, ans);
    }

    public static int[] printNos(int x) {
        int []ans = new int[x];
        recursiveFunction(x, ans);

        return ans;
    }
}