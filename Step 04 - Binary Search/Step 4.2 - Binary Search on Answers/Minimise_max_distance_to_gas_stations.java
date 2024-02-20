/*You are given a sorted array ‘arr’ of length ‘n’, which contains positive integer positions of ‘n’ gas stations on the X-axis.
You are also given an integer ‘k’.

You have to place 'k' new gas stations on the X-axis.
You can place them anywhere on the non-negative side of the X-axis, even on non-integer positions.

Let 'dist' be the maximum value of the distance between adjacent gas stations after adding 'k' new gas stations.

Find the minimum value of dist.

Example:
Input: ‘n' = 7 , ‘k’=6, ‘arr’ = {1,2,3,4,5,6,7}.

Answer: 0.5

Explanation:
We can place 6 gas stations at 1.5, 2.5, 3.5, 4.5, 5.5, 6.5. 

Thus the value of 'dist' will be 0.5. It can be shown that we can't get a lower value of 'dist' by placing 6 gas stations.

Note:
You will only see 1 or 0 in the output where:
  1 represents your answer is correct.
  0 represents your answer is wrong. 
Answers within 10^-6 of the actual answer will be accepted. */
public class Solution {
    public static double MinimiseMaxDistance(int[] arr, int K) {
        // Write your code here.
        int n = arr.length;
        double low = 0;
        double high = arr[n - 1] - arr[0];
        double diff = 1e-6;
        while (high - low > diff) {
            double mid = (low + high) / 2;
            int cnt = countStations(mid, arr);
            if (cnt > K) 
                low = mid;
            else 
                high = mid;
        }
        return high;
    }

    private static int countStations(double dist, int[] arr) {
        int cnt = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            cnt += Math.ceil((arr[i] - arr[i - 1]) / dist) - 1;
        }
        return cnt;
    }
}
